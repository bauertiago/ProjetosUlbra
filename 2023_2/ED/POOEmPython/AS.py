import mysql.connector

class banco:
    def __init__(self, db_config):
        self.db_config = db_config

    # Função para criar o banco de dados
    def criar_banco(self):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()

        cursor.execute('''
            CREATE TABLE IF NOT EXISTS contatostiago (
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(50),
                perfil_linkedin VARCHAR(50)
            );
        ''')

        conn.commit()
        conn.close()
    
    

    #Função para Adicionar Contatos
    def adicionar_contato(self, nome, perfil_linkedin):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()
        
        try:
            cursor.execute('SELECT * FROM contatostiago WHERE perfil_linkedin = %s', (perfil_linkedin,))
            if cursor.fetchone() is None:
                cursor.execute('INSERT INTO contatostiago (nome, perfil_linkedin) VALUES (%s, %s)', (nome, perfil_linkedin))
                conn.commit()
            else:
                print("Contato já cadastrado.")
        except mysql.connector.Error as erro:
            print(f"Ocorreu um erro {erro}. Tente novamente.")

        conn.close()
    
    # Função para listar contatos
    def listar_contatos(self):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()

        cursor.execute('SELECT * FROM contatostiago')
        contatos = cursor.fetchall()

        conn.close()
        return contatos

    # Função para excluir contato
    def excluir_contato(self, id):
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()
        cursor.execute('DELETE FROM contatostiago WHERE id = %s', (id,))

        conn.commit()
        conn.close()
        
    def menu(self):
        while True:
            print("""MENU:
    1- Adicionar Contato
    2- Listar Contatos
    3- Excluir Contato
    0- SAIR""")
            opc = int(input("Digite uma opção: "))
            if opc == 1:
                nome = input("Nome do contato: ")
                perfil_linkedin = input("Perfil do LinkedIn: ")
                self.adicionar_contato(nome, perfil_linkedin)
            elif opc == 2:
                contatos = self.listar_contatos()
                if contatos:
                    print("Lista de Contatos:")
                    for contato in contatos:
                        print(f"ID: {contato[0]}, Nome: {contato[1]}, Perfil LinkedIn: {contato[2]}")
                else:
                    print("A Lista de contatos está vazia.")
            elif opc == 3:
                id = input("Informe o ID do contato a ser excluído: ")
                self.excluir_contato(id)
            elif opc == 0:
                print("PROGRAMA ENCERRADO")
                break    
            else:
                print("Digite uma opção válida!!")        
        
if __name__ == "__main__":
    db_config = {
        'user':'natanhmc',
        'password':'1q2w3e4r5t',
        'host':'db4free.net',
        'database':'linkedin123',
        'port':3306
    }
    
    meu_banco = banco(db_config)
    meu_banco.criar_banco()
    meu_banco.menu()
    