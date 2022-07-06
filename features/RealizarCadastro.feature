#language: pt
#enconding: iso-8859-1

Funcionalidade: Realizar Cadastro como usuario no site

Cenario: Realizar cadastro com sucesso.
Dado Acessar a pagina do usuario
E informar o nome "Marcio"
E informar a data de nascimento 
E informar o sexo
E informar o estado civil
E informar o telefone "21999999999"
E informar o email "usuario2022@hotmail.com"
E informar a rede social "@marcionascimento"
E informar o endereco "Rua Presidente Vargas"
E informar o complemento "12569"
E informar o bairro "Centro"
E informar a cidade "Rio de Janeiro"
E informar o estado
E informar o CEP "250000"
E informar o peso "70"
E informar a altura "1.63"
E informar o torax "0.40"
E informar a cintura "0.41"
E informar o abdome "0.42"
E informar o quadril "0.43"
E informar o ante braco direiro "0.44"
E informar o ante braco esquerdo "0.45"
E informar o braco direito "0.46"
E informar o braco esquerdo "0.47"
E informar a coxa direita "0,48"
E informar a coxa esquerda "0,49"
E informar a panturrilha direita "0.50"
E informar a panturrilha esquerda "0.51"
Quando Solicitar a realizacao do cadastro
Entao Sistema confirma o envio do formulario com sucesso 


Cenario: Validacao do campos obrigatorios
Sistema deverá verificar os campos nomes e telefones do formulário
Dado Acessar a pagina do usuario
Quando Solicitar a realizacao do cadastro
Entao Sistema informa que os campos nome e telefones são obrigatórios


Cenario: Validacao do campo nome obrigatorio
Sistema deverá verificar o campo nome foi preenchido
Dado Acessar a pagina do usuario
E informar o telefone "21999998888"
Quando Solicitar a realizacao do cadastro
Entao Sistema informa que o campo nome é obrigatório


Cenario: Validacao do campo telefone obrigatorio
Sistema deverá verificar o campo telefone foi preenchido
Dado Acessar a pagina do usuario
E informar o nome "Marcio"
Quando Solicitar a realizacao do cadastro
Entao Sistema informa que o campo telefone é obrigatório





