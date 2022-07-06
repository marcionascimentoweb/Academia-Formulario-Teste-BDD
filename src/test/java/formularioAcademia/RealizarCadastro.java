package formularioAcademia;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RealizarCadastro {


	WebDriver driver;
	
	@Dado("^Acessar a pagina do usuario$")
	public void acessar_a_pagina_do_usuario() throws Throwable {
		
		// Utilizar o driver do Chrome
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		
		//Inicializar o selenium driver
		driver = new ChromeDriver();
		
		//Manimizar a tela
		driver.manage().window().maximize();
		
		//Buscando os arquivos
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/index.html");
	}
	
	@Dado("^informar o nome \"([^\"]*)\"$")
	public void informar_o_nome(String arg1) throws Throwable {
	    driver.findElement(By.id("nome")).sendKeys("Marcio");
	    Assert.assertEquals("Marcio", driver.findElement(By.id("nome")).getAttribute("value"));
	}

	@Dado("^informar a data de nascimento$")
	public void informar_a_data_de_nascimento() throws Throwable {
	    driver.findElement(By.id("dataNascimento")).sendKeys("02022000");
  	}

	@Dado("^informar o sexo$")
	public void informar_o_sexo() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"masculino\"]")).click();
	}

	@Dado("^informar o estado civil$")
	public void informar_o_estado_civil() throws Throwable {
		WebElement  element = driver.findElement(By.id("estadoCivil"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Solteiro");
	}

	@Dado("^informar o telefone \"([^\"]*)\"$")
	public void informar_o_telefone(String arg1) throws Throwable {
	    driver.findElement(By.id("telefone")).sendKeys("21999999999");
	    Assert.assertEquals("21999999999", driver.findElement(By.id("telefone")).getAttribute("value"));
	 }

	@Dado("^informar o email \"([^\"]*)\"$")
	public void informar_o_email(String arg1) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("usuario1@hotmail.com");
	    Assert.assertEquals("usuario1@hotmail.com", driver.findElement(By.id("email")).getAttribute("value"));
	}

	@Dado("^informar a rede social \"([^\"]*)\"$")
	public void informar_a_rede_social(String arg1) throws Throwable {
	    driver.findElement(By.id("redesSociais")).sendKeys("@marcionascimento");
	    Assert.assertEquals("@marcionascimento", driver.findElement(By.id("redesSociais")).getAttribute("value"));
	}

	@Dado("^informar o endereco \"([^\"]*)\"$")
	public void informar_o_endereco(String arg1) throws Throwable {
	    driver.findElement(By.id("endereco")).sendKeys("Rua Presidente Vargas");
	    Assert.assertEquals("Rua Presidente Vargas", driver.findElement(By.id("endereco")).getAttribute("value"));
	}

	@Dado("^informar o complemento \"([^\"]*)\"$")
	public void informar_o_complemento(String arg1) throws Throwable {
	    driver.findElement(By.id("complemento")).sendKeys("12");
	    Assert.assertEquals("12", driver.findElement(By.id("complemento")).getAttribute("value"));
	}

	@Dado("^informar o bairro \"([^\"]*)\"$")
	public void informar_o_bairro(String arg1) throws Throwable {
	   driver.findElement(By.id("bairro")).sendKeys("Centro");
	   Assert.assertEquals("Centro", driver.findElement(By.id("bairro")).getAttribute("value"));
	}

	@Dado("^informar a cidade \"([^\"]*)\"$")
	public void informar_a_cidade(String arg1) throws Throwable {
	    driver.findElement(By.id("cidade")).sendKeys("Rio de Janeiro");
	    Assert.assertEquals("Rio de Janeiro", driver.findElement(By.id("cidade")).getAttribute("value"));
	}

	@Dado("^informar o estado$")
	public void informar_o_estado() throws Throwable {
		WebElement element = driver.findElement(By.id("estado"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Rio de Janeiro");
	}

	@Dado("^informar o CEP \"([^\"]*)\"$")
	public void informar_o_CEP(String arg1) throws Throwable {
	    driver.findElement(By.id("cep")).sendKeys("250000000");
	    Assert.assertEquals("250000000", driver.findElement(By.id("cep")).getAttribute("value"));
	}

	@Dado("^informar o peso \"([^\"]*)\"$")
	public void informar_o_peso(String arg1) throws Throwable {
	    driver.findElement(By.id("peso")).sendKeys("70");
	    Assert.assertEquals("70", driver.findElement(By.id("peso")).getAttribute("value"));
	}

	@Dado("^informar a altura \"([^\"]*)\"$")
	public void informar_a_altura(String arg1) throws Throwable {
		driver.findElement(By.id("altura")).sendKeys("1.63");
		Assert.assertEquals("1.63", driver.findElement(By.id("altura")).getAttribute("value"));
	}

	@Dado("^informar o torax \"([^\"]*)\"$")
	public void informar_o_torax(String arg1) throws Throwable {
		driver.findElement(By.id("torax")).sendKeys("0.40");
		Assert.assertEquals("0.40", driver.findElement(By.id("torax")).getAttribute("value"));
	}

	@Dado("^informar a cintura \"([^\"]*)\"$")
	public void informar_a_cintura(String arg1) throws Throwable {
	    driver.findElement(By.id("cintura")).sendKeys("0.41");
	    Assert.assertEquals("0.41", driver.findElement(By.id("cintura")).getAttribute("value"));
	}

	@Dado("^informar o abdome \"([^\"]*)\"$")
	public void informar_o_abdome(String arg1) throws Throwable {
	    driver.findElement(By.id("abdome")).sendKeys("0.42");
	    Assert.assertEquals("0.42", driver.findElement(By.id("abdome")).getAttribute("value"));
	}

	@Dado("^informar o quadril \"([^\"]*)\"$")
	public void informar_o_quadril(String arg1) throws Throwable {
	    driver.findElement(By.id("quadril")).sendKeys("0.43");
	    Assert.assertEquals("0.43", driver.findElement(By.id("quadril")).getAttribute("value"));
	}

	@Dado("^informar o ante braco direiro \"([^\"]*)\"$")
	public void informar_o_ante_braco_direiro(String arg1) throws Throwable {
	    driver.findElement(By.id("antebracoDireito")).sendKeys("0.44");
	    Assert.assertEquals("0.44", driver.findElement(By.id("antebracoDireito")).getAttribute("value"));
	}

	@Dado("^informar o ante braco esquerdo \"([^\"]*)\"$")
	public void informar_o_ante_braco_esquerdo(String arg1) throws Throwable {
		driver.findElement(By.id("antebracoEsquerdo")).sendKeys("0.45");
		Assert.assertEquals("0.45", driver.findElement(By.id("antebracoEsquerdo")).getAttribute("value"));
	}

	@Dado("^informar o braco direito \"([^\"]*)\"$")
	public void informar_o_braco_direito(String arg1) throws Throwable {
	    driver.findElement(By.id("bracoDireito")).sendKeys("0.46");
	    Assert.assertEquals("0.46", driver.findElement(By.id("bracoDireito")).getAttribute("value"));
	}

	@Dado("^informar o braco esquerdo \"([^\"]*)\"$")
	public void informar_o_braco_esquerdo(String arg1) throws Throwable {
	    driver.findElement(By.id("bracoEsquerdo")).sendKeys("0.47");
	    Assert.assertEquals("0.47", driver.findElement(By.id("bracoEsquerdo")).getAttribute("value"));
	}

	@Dado("^informar a coxa direita \"([^\"]*)\"$")
	public void informar_a_coxa_direita(String arg1) throws Throwable {
	    driver.findElement(By.id("coxaDireita")).sendKeys("0.48");
	    Assert.assertEquals("0.48", driver.findElement(By.id("coxaDireita")).getAttribute("value"));
	}

	@Dado("^informar a coxa esquerda \"([^\"]*)\"$")
	public void informar_a_coxa_esquerda(String arg1) throws Throwable {
	    driver.findElement(By.id("coxaEsquerda")).sendKeys("0.49");
	    Assert.assertEquals("0.49", driver.findElement(By.id("coxaEsquerda")).getAttribute("value"));
	}

	@Dado("^informar a panturrilha direita \"([^\"]*)\"$")
	public void informar_a_panturrilha_direita(String arg1) throws Throwable {
	    driver.findElement(By.id("panturrilhaDireito")).sendKeys("0.50");
	    Assert.assertEquals("0.50", driver.findElement(By.id("panturrilhaDireito")).getAttribute("value"));
	}

	@Dado("^informar a panturrilha esquerda \"([^\"]*)\"$")
	public void informar_a_panturrilha_esquerda(String arg1) throws Throwable {
	    driver.findElement(By.id("panturrilhaEsquerdo")).sendKeys("0.51");
	    Assert.assertEquals("0.51", driver.findElement(By.id("panturrilhaEsquerdo")).getAttribute("value"));
	}

	@Quando("^Solicitar a realizacao do cadastro$")
	public void solicitar_a_realizacao_do_cadastro() throws Throwable {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)"); // if the element is on bottom.
		
		//executa o click
		driver.findElement(By.xpath("/html/body/article[1]/section/form/div[6]/input[1]")).click();
	}

	@Entao("^Sistema confirma o envio do formulario com sucesso$")
	public void sistema_confirma_o_envio_do_formulario_com_sucesso() throws Throwable {
		String mensagemObtida = driver.findElement(By.xpath("/html/body/article[2]/div")).getText();
		assertEquals(mensagemObtida, "Cadastro realizado com sucesso!");
	}
	
	@Entao("^Sistema informa que os campos nome e telefones s?o obrigat?rios$")
	public void sistema_informa_que_os_campos_nome_e_telefones_s_o_obrigat_rios() throws Throwable {
		String mensagemValidacao = driver.findElement(By.xpath("/html/body/article[2]/div")).getText();
		assertEquals(mensagemValidacao, "Por favor preecha os campos Nome e Telefone"); 
	}

	@Entao("^Sistema informa que o campo nome ? obrigat?rio$")
	public void sistema_informa_que_o_campo_nome_obrigat_rio() throws Throwable {
		String mensagemValidacaoNome = driver.findElement(By.xpath("/html/body/article[2]/div")).getText();
		assertEquals(mensagemValidacaoNome, "Por favor preecha o campo nome");
	}

	@Entao("^Sistema informa que o campo telefone ? obrigat?rio$")
	public void sistema_informa_que_o_campo_telefone_obrigat_rio() throws Throwable {
		String mensagemValidacaoTel = driver.findElement(By.xpath("/html/body/article[2]/div")).getText();
		assertEquals(mensagemValidacaoTel, "Por favor preecha o campo Telefone"); 
	}


}
