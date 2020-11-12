# Desafio-BeerTech

## O que deve ser desenvolvido:

### Tela de listagem de produtos:
* Fazer a chamada na API https://private-8f4dda-testeabi.apiary-mock.com/produtos (GET)
* Criar uma lista com a resposta da API
* Validar se o campo **desconto == true** e colocar o campo **preço** em verde #0FB816
* Exemplo da tela: 

![Screenshot from 2020-11-11 13-36-14](https://user-images.githubusercontent.com/29542731/98838519-264d7d80-2423-11eb-926b-a11c70372cd4.png)


### Bonus:
* Fazer uma tela de login
* Validar se o login ou senha estão com o campo vazio, caso esteja mostrar o erro para o usuário
* Validar o login na API (POST)
  ```curl --include \
     --request POST \
     --header "Content-Type: application/json" \
     --data-binary "{
    \"login\": \"Stella\",
    \"senha\": \"abi123\" 
    }" \
    'https://private-8f4dda-testeabi.apiary-mock.com/Login'
* Mostrar ao usuário, caso haja erro ao chamar a API
* Exemplo de tela:

![Screenshot from 2020-11-11 13-36-01](https://user-images.githubusercontent.com/29542731/98838565-336a6c80-2423-11eb-99f4-e3035b0fba69.png)
