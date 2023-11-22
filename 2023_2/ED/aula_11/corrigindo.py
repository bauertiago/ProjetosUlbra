import mysql.connector
import pymysql

db_config = {
    'user':'natanhmc',
    'password':'1q2w3e4r5t',
    'host':'db4free.net',
    'database':'linkedin123',
    'port':3306
}



def carregar_grafo_do_banco():
    # Conecte-se ao banco de dados
    conn = pymysql.connect(**db_config)

    # Crie um cursor
    cursor = conn.cursor()

    # Selecione todos os contatos
    cursor.execute("SELECT id, nome, perfil_linkedin FROM contatos")

    # Crie um dicionário para armazenar o grafo
    grafo = {}

    # Itere sobre os contatos
    for contato in cursor:
        # Adicione o contato ao dicionário
        grafo[contato[0]] = []

        # Selecione todas as conexões do contato
        cursor.execute("SELECT contato1_id, contato2_id FROM conexoes")

        # Itere sobre as conexões
        for conexao in cursor:
            # Adicione a conexão ao dicionário
            grafo[contato[0]].append(conexao[1] if conexao[0] == contato[0] else conexao[0])

    # Feche o cursor e a conexão com o banco de dados
    cursor.close()
    conn.close()

    return grafo

grafo = carregar_grafo_do_banco()

print(grafo)


# Função para criar o banco de dados
def criar_banco():
    
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()
   
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS contatos (
            id INT auto_increment PRIMARY KEY,
            nome VARCHAR(50),
            perfil_linkedin VARCHAR(50)
        );
    ''')

    cursor.execute('''
        CREATE TABLE IF NOT EXISTS conexoes (
            id INT AUTO_INCREMENT PRIMARY KEY,
            contato1_id INT,
            contato2_id INT,
            FOREIGN KEY (contato1_id) REFERENCES contatos(id),
            FOREIGN KEY (contato2_id) REFERENCES contatos(id)
        );
    ''')

    conn.commit()
    conn.close()

# Função para adicionar um contato
def adicionar_contato(nome, perfil_linkedin):
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    try:
        cursor.execute('SELECT * FROM contatos where perfil_linkedin = %s',(perfil_linkedin,))
        if cursor.fetchone() is None:
            cursor.execute('INSERT INTO contatos (nome, perfil_linkedin) VALUES (%s, %s)', (nome, perfil_linkedin))
            conn.commit()
        else:
            print("Contato ja cadastrado.")
    except mysql.connector.Error as erro:
        print(f"Erro ao adicionar contato{erro}")
    conn.close()

# Função para listar contatos
def listar_contatos():
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    cursor.execute('SELECT * FROM contatos')
    contatos = cursor.fetchall()

    conn.close()
    return contatos


# Função para adicionar uma conexão
def adicionar_conexao(contato1_id, contato2_id):
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    cursor.execute('BEGIN')
    
    try:
        cursor.execute('SELECT * FROM conexoes WHERE (contato1_id = %s AND contato2_id = %s) OR (contato1_id = %s AND contato2_id = %s)',
                      (contato1_id, contato2_id, contato2_id, contato1_id))

        if cursor.fetchone() is None:
            cursor.execute('INSERT INTO conexoes (contato1_id, contato2_id) VALUES (%s, %s)', (contato1_id, contato2_id))
        else:
            print("A conexão entre esses contatos já existe.")
        
        conn.commit()
        
    except mysql.connector.Error as erro:
        conn.rollback()
        print(f"Ocorreu um erro{erro}. Tente novamente.")
        
    conn.close()

# Função para listar conexões de um contato
def listar_conexoes(contato_id):
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    cursor.execute('''
        SELECT contatos.nome
        FROM contatos
        JOIN conexoes ON contatos.id = CASE
            WHEN conexoes.contato1_id = %s THEN conexoes.contato2_id
            ELSE conexoes.contato1_id
        END
        WHERE conexoes.contato1_id = %s OR conexoes.contato2_id = %s
    ''', (contato_id, contato_id, contato_id))

    conexoes = cursor.fetchall()
    conn.close()
    return conexoes

#Função para excluir uma conexão
def excluir_conexao(contato_id1,contato_id2):
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()
    cursor.execute('DELETE FROM conexoes WHERE (contato1_id = %s AND contato2_id = %s) OR (contato1_id = %s AND contato2_id = %s)', (contato_id1, contato_id2, contato_id2, contato_id1))

    conn.commit()
    conn.close()

# Função para excluir contato
def excluir_contato(contato_id):
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    cursor.execute('DELETE FROM contatos WHERE contato1_id = %s OR contato2_id = %s', (contato_id,contato_id))
    cursor.execute('DELETE FROM contatos WHERE contato_id = %s', (contato_id,))
    
    conn.commit()
    conn.close()


# Função principal do menu
def menu():
    while True:
        print("\n1. Adicionar Contato")
        print("2. Listar Contatos")
        print("3. Adicionar Conexão")
        print("4. Listar Conexões de um Contato")
        print("5. Excluir Contato")
        print("6. Excluir Conexão")
        print("0. Sair")

        escolha = input("Escolha uma opção: ")

        if escolha == "1":
            nome = input("Nome do contato: ")
            perfil_linkedin = input("Perfil do LinkedIn: ")
            adicionar_contato(nome, perfil_linkedin)
        elif escolha == "2":
            contatos = listar_contatos()
            print("Lista de Contatos:")
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
        elif escolha == "5":
            contato_id = input("Digite o Id do contato a ser excluido: ")
            excluir_contato(contato_id)
        elif escolha == "6":
            contato_id1 = input("Informe o ID do primeiro contato: ")
            contato_id2 = input("Informe o ID do segundo contato: ")
            excluir_conexao(contato_id1, contato_id2)
        elif escolha == "0":
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    criar_banco()  # Certifique-se de que as tabelas estão criadas
    menu()
