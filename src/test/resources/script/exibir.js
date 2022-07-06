

function exibir(){
    const form = document.querySelector('.form');
    const exibirResultado = document.querySelector('.exibirResultado');
    var verificaSexo = document.querySelector('input[name="sexo"]:checked');
                       
        //Dados Pessoais 
        exibirResultado.innerHTML += `<br><h4>Dados Pessoais<h4>`;
        exibirResultado.innerHTML += `<p> Nome: ${nome.value}</p>`;
        exibirResultado.innerHTML += `<p> Data de Nascimento: ${dataNascimento.value}</p>`;
        exibirResultado.innerHTML += `<p> Estado Civil: ${estadoCivil.value}</p>`;
       
        //validação sexo
        if(verificaSexo == null){
            verificaSexo = "";
            exibirResultado.innerHTML += verificaSexo;
        }else{
            exibirResultado.innerHTML += `<p> Sexo: ${document.querySelector('input[name="sexo"]:checked').value}</p>`;        
        }
   
    //Contato
    exibirResultado.innerHTML += `<br><h4>Contatos<h4>`;
    exibirResultado.innerHTML += `<p> Telefone: ${telefone.value}</p>`;
    exibirResultado.innerHTML += `<p>Email: ${email.value}</p>`;
    exibirResultado.innerHTML += `<p>Redes Sociais: ${redesSociais.value}</p>`;

    //Endereço
    exibirResultado.innerHTML += `<br><h4>Endereço<h4>`;
    exibirResultado.innerHTML += `<p> Endereço: ${endereco.value}</p>`;
    exibirResultado.innerHTML += `<p>Complemento: ${complemento.value}</p>`;
    exibirResultado.innerHTML += `<p>Bairro: ${bairro.value}</p>`;
    exibirResultado.innerHTML += `<p>Cidade: ${cidade.value}</p>`;
    exibirResultado.innerHTML += `<p>Cidade: ${estado.value}</p>`;
    exibirResultado.innerHTML += `<p>CEP: ${cep.value}</p>`;

    //Avaliação
    exibirResultado.innerHTML += `<br><h4>Avaliação Inicial`;
    exibirResultado.innerHTML += `<p> Peso: ${peso.value}`;
    exibirResultado.innerHTML += `<p> Altura: ${altura.value}`;
    exibirResultado.innerHTML += `<p> Torax: ${torax.value}`;
    exibirResultado.innerHTML += `<p> Cintura: ${cintura.value}`;
    exibirResultado.innerHTML += `<p> Abdome: ${abdome.value}`;
    exibirResultado.innerHTML += `<p> Quadril: ${quadril.value}`;
    exibirResultado.innerHTML += `<p> Ante Braço Direito: ${antebracoDireito.value}`;
    exibirResultado.innerHTML += `<p> Ante Braço Esquerdo: ${antebracoEsquerdo.value}`;
    exibirResultado.innerHTML += `<p> Braço Direito: ${bracoDireito.value}`;
    exibirResultado.innerHTML += `<p> Braço Esquerdo: ${bracoEsquerdo.value}`;
    exibirResultado.innerHTML += `<p> Coxa Direita: ${coxaDireita.value}`;
    exibirResultado.innerHTML += `<p> Coxa Esquerda: ${coxaEsquerda.value}`;
    exibirResultado.innerHTML += `<p> Panturrilha Direita: ${panturrilhaDireito.value}`;
    exibirResultado.innerHTML += `<p> Panturrilha Esquerda: ${panturrilhaEsquerdo.value}`;
}