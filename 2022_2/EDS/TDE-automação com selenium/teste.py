from selenium import webdriver
from selenium.webdriver.common.by import By

#Iniar o navegador
driver = webdriver.Chrome()
#Acessar a url do Python
driver.get('https://www.python.org/')
#Digitar o texto "Python no input"
driver.find_element(By.CSS_SELECTOR, ('#id-search-field')).send_keys("Python")
#Clicar no botão pesquisar
driver.find_element(By.CSS_SELECTOR, ('#submit')).click()
#Encerrar o browser
driver.quit()


