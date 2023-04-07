from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

#Iniar o navegador
driver = webdriver.Chrome()
time.sleep(2)
#Acessar a url do Python
driver.get('https://www.google.com.br/')
time.sleep(2)
#maximizar
driver.maximize_window()
time.sleep(2)
#Digitar o texto "Python no input"
driver.find_element(By.NAME,("q")).send_keys("Computação ULBRA Torres")
time.sleep(2)
#Clicar no botão pesquisar
search_box = driver.find_element("name", "q")
search_box.submit()
time.sleep(2)
#Encerrar o browser
driver.quit()