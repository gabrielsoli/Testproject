package cursoselenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TesteCampoTreinamento {
	
	private WebDriver driver;
	private DSL dsl;
	private MultinotasPage page;
	
	@Before
	public void iniciar() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Gabriel Oliveira\\\\eclipse-workspace\\\\cursoselenium\\\\chromedriver.exe");
		driver.get("http://multinotas.nasajonsistemas.com.br/");
		dsl = new DSL(driver);
		page.setLogin("testeregressao@nasajonsistema.com.br");
		page.setSeha("123456");
		page.logar();
		page = new MultinotasPage(driver);
		
		
	}
	
	@After
	public void finalizar(){
		
		driver.quit();
	
	}
	

	
	
			@Test
			public void CaseTest2_criargrupoempresarial() {
			
			page.setCodigo("DSL");	
			page.clicarCampoDescricao();
			page.setDescricao("TESTE PAGE");
			page.saveByCss();
			
			Assert.assertEquals("Sucesso ao inserir Grupo Empreserial!", driver.findElement(By.cssSelector("div.ng-binding.toast-title"))
			.getAttribute("value"));
			
			
			}
			
			@Test
			public void CaseTest3_criarempresa() {
		
			page.criarempresa();
			page.setNomeFantasia("Testewebdriver");
			page.setRazaoSocial("Testewebdriver");
			page.setCNPJ("43081244000159");
			page.setLogradouro("rua be");
			page.setNumeroLograd("59");
			page.setCep("22775784");
			page.selecionarUF("RJ");
			
			page.selecionarMunicipio("Rio de Janeiro");
			
			page.setBairro("Taquara");
			page.setEmail("gabrieloliveira@nasajon.com.br");
			page.selecionaGEmpresarial("Teste WebDriver");
			
			page.salvarempresa();
			
		
		
			}
	
}
