

//Este não esta usando pois esta enviar e exibir na mesma página


function salvar(){

    const form = document.querySelector('.form');
    const resultado = document.querySelector('.resultado');
    var verificaSexo = document.querySelector('input[name="sexo"]:checked');
       
        //Dados Pessoais 
        resultado.innerHTML += `<br><h4>Dados Pessoais<h4>`;
        resultado.innerHTML += `<p> Nome: ${nome.value}</p>`;
        resultado.innerHTML += `<p> Data de Nascimento: ${dataNascimento.value}</p>`;
        resultado.innerHTML += `<p> Estado Civil: ${estadoCivil.value}</p>`;
       
        //validação sexo
        if(verificaSexo == null){
            verificaSexo = "";
            resultado.innerHTML += verificaSexo;
            //resultado.innerHTML += `<p> Sexo: ${verificaSexo}</p>`;        
        }else{
        resultado.innerHTML += `<p> Sexo: ${document.querySelector('input[name="sexo"]:checked').value}</p>`;        
        }
        
        
        //Contato
        resultado.innerHTML += `<br><h4>Contatos<h4>`;
        resultado.innerHTML += `<p> Telefone: ${telefone.value}</p>`;
        resultado.innerHTML += `<p>Email: ${email.value}</p>`;
        resultado.innerHTML += `<p>Redes Sociais: ${redesSociais.value}</p>`;

        //Endereço
        resultado.innerHTML += `<br><h4>Endereço<h4>`;
        resultado.innerHTML += `<p> Endereço: ${endereco.value}</p>`;
        resultado.innerHTML += `<p>Complemento: ${complemento.value}</p>`;
        resultado.innerHTML += `<p>Bairro: ${bairro.value}</p>`;
        resultado.innerHTML += `<p>Cidade: ${cidade.value}</p>`;
        resultado.innerHTML += `<p>Cidade: ${estado.value}</p>`;
        resultado.innerHTML += `<p>CEP: ${cep.value}</p>`;

        //Avaliação
        resultado.innerHTML += `<br><h4>Avaliação Inicial`;
        resultado.innerHTML += `<p> Peso: ${peso.value}`;
        resultado.innerHTML += `<p> Altura: ${altura.value}`;
        resultado.innerHTML += `<p> Torax: ${torax.value}`;
        resultado.innerHTML += `<p> Cintura: ${cintura.value}`;
        resultado.innerHTML += `<p> Abdome: ${abdome.value}`;
        resultado.innerHTML += `<p> Quadril: ${quadril.value}`;
        resultado.innerHTML += `<p> Ante Braço Direito: ${antebracoDireito.value}`;
        resultado.innerHTML += `<p> Ante Braço Esquerdo: ${antebracoEsquerdo.value}`;
        resultado.innerHTML += `<p> Braço Direito: ${bracoDireito.value}`;
        resultado.innerHTML += `<p> Braço Esquerdo: ${bracoEsquerdo.value}`;
        resultado.innerHTML += `<p> Coxa Direita: ${coxaDireita.value}`;
        resultado.innerHTML += `<p> Coxa Esquerda: ${coxaEsquerda.value}`;
        resultado.innerHTML += `<p> Panturrilha Direita: ${panturrilhaDireito.value}`;
        resultado.innerHTML += `<p> Panturrilha Esquerda: ${panturrilhaEsquerdo.value}`;
        

        //Validação

        
        //nome
        if(document.getElementById("nome").value==""){
            resultado.innerHTML = "Por favor preecha o campo nome"
            resultado.style.color = 'red';
        }
        
        
        //telefone
        if(document.getElementById("telefone").value==""){
            resultado.innerHTML = "Por favor preecha o campo Telefone"
            resultado.style.color = 'red';
        }
    
    //nome e telefone
    if(document.getElementById("nome").value=="" && document.getElementById("telefone").value==""){
        resultado.innerHTML = "Por favor preecha os campos Nome e Telefone"
        resultado.style.color = 'red';
    }

}
