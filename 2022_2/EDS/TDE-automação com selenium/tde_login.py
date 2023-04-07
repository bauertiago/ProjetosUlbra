from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

#Iniar o navegador
driver = webdriver.Chrome()
time.sleep(2)
#Acessar a url
driver.get('https://www.browserstack.com/users/sign_in/')
time.sleep(2)
#Digitar o email
driver.find_element(By.CSS_SELECTOR, ('#user_email_login')).send_keys("tiagobauerdm@gmail.com")
time.sleep(2)
#Digitar a senha
driver.find_element(By.CSS_SELECTOR, ('#user_password')).send_keys("#Tiago12")
time.sleep(2)
#Clicar sing me in
driver.find_element(By.CSS_SELECTOR, ('#user_submit')).click()
time.sleep(8)

# driver.get('https://www.browserstack.com/users/sign_in/')

#Encerrar o browser
driver.quit()