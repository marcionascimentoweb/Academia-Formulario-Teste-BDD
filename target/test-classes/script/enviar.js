function enviar(){

    const form = document.querySelector('.form');
    const resultado = document.querySelector('.resultado');

     
                
        //Validação

        //nome
        toString(document.getElementById("dataNascimento"));
        

        if(document.getElementById("nome").value=="" && document.getElementById("telefone").value==""){
            resultado.innerHTML = "Por favor preecha os campos Nome e Telefone"
            resultado.style.color = 'red';
        }
        else if(document.getElementById("nome").value==""){
            resultado.innerHTML = "Por favor preecha o campo nome"
            resultado.style.color = 'red';
        }
        else if(document.getElementById("telefone").value==""){
            resultado.innerHTML = "Por favor preecha o campo Telefone"
            resultado.style.color = 'red';
        }
        else{
                resultado.innerHTML = "Cadastro realizado com sucesso!";
        }

}
