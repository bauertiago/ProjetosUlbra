import sqlite3

#Função para criar o banco de dados
def criar_banco():
    conn = sqlite3.connect('linkedin_network.db')
    cursor = conn.cursor()

    cursor.execute('''
        create table if not exists contatos (
            id integer primary key,
            none text,
            perfil_linkedin text
        )
    ''')

    cursor.execute('''
        create table if not exists conexoes (
            id integer primary key,
            contato1_id integer,
            contato2_id integer,
            foreign key (contato1_id) references contatos(id),
            foreign key (contato2_id) references contatos(id)
        )
    ''')

    conn.commit()
    conn.close()

#Função para adicionar um contato
def adicionar_contato(nome, perfil_linkedin):
    conn = sqlite3.connect('linkedin_network.db')
    cursor = conn.cursor()

    cursor.execute('insert into contatos (nome, perfil_linkedin) values (?, ?)', (nome,perfil_linkedin))
    conn.commit()
    conn.close()

#Função para listar contatos
def listar_contatos():
    conn = sqlite3.connect('linkedin_network.db')
    cursor = conn.cursor()

    cursor.execute('select * from contatos')
    contatos = cursor.fetchall()

    conn.close()
    return contatos

#Função para adicionar uma conexão
def adicionar_conexao(contato1_id, contato2_id):
    conn = sqlite3.connect('linkedin_network.db')
    cursor = conn.cursor()

    cursor.execute('begin')

    try:
        cursor.execute('select * from conexoes where (contato1_id = ? and contato2_id = ?) or (contato1_id = ? and contato2_id = ?)', (contato1_id,contato2_id,contato2_id,contato1_id))
        if cursor.fetchone() is None:
            cursor.execute('insert into conexoes (contato1_id, contato2_id) values (?, ?)', (contato1_id, contato2_id))
        else:
            print("Conexão entre esses contatos já existente")
        conn.commit()

    except sqlite3.IntegrityError:
        conn.rollback()
        print("Ocorreu um erro de concoorrência. Tente novamente")

    conn.close()

#Função para listar conexões de um contato
def listar_conexoes(contato_id):
    conn = sqlite3.connect('linkedin_network.db')
    cursor = conn.cursor()

    cursor.execute('''
        select contatos.nome
        from contatos
        join conexoes on contatos.id = case
            when conexoes.contato1_id = ? then conexoes.contato2_id
            else conexoes.contato1_id
        and
        where conexoes.contato1_id = ? or conexoes.contato2_id = ?
''', (contato_id, contato_id, contato_id))
    
    conexoes = cursor.fetchall()
    conn.close()
    return conexoes

#Função principal do menu
def menu():
    while True:
        print("""
            1 - Adicionar Contato
            2 - Listar Contatos
            3 - Adidionar Conexão
            4 - listar Conexão de um Contato
            0 - Sair
""")
        
        escolha = input("Escolha uma opção: ")

        if escolha == "1":
            nome = input("Nome do contato: ")
            perfil_linkedin = input("Perfil do LinkedIn: ")
            adicionar_contato(nome, perfil_linkedin)
        elif escolha == "2":
            contatos = listar_contatos()
            print("Lista de contatos:")
            for contato in contatos:
                print(f"ID: {contato[0]}, Nome: {contato[1]}, Perfil LinkedIn: {contato[2]}")
        elif escolha == "3":
            contato1_id = int(input("ID do primeiro contato: "))
            contato2_id = int(input("ID do segundo contato: "))
            adicionar_conexao(contato1_id, contato2_id)
        elif escolha == "4":
            contato_id = int(input("ID do contato: "))
            conexoes = listar_conexoes(contato_id)
            print("Conexões do Contato:")
            for conexao in conexoes:
                print(conexao[0])
        elif escolha == "0":
            break
        else:
            print("Opção inválida. Tente novamente.")

        if __name__ == "__main__":
            criar_banco() #Certifique-se de que as tabelas estão criadas
            menu()
