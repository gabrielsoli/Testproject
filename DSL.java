package cursoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DSL {

	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void escrevernocampo(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).clear();
		driver.findElement(By.id(id_campo)).sendKeys(texto);
	
	}
	
	public void clicarnocampo(String campo) {
		
		driver.findElement(By.id(campo)).click();
	}

	public String obtervalorcampo(String id_campo) {
		
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}
	
	public void selecionarvalor(String id_campo, String valor) {
		
		WebElement element = driver.findElement(By.id(id_campo));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void selecionarvalorporCSS(String css, String valor) {
		
		WebElement element = driver.findElement(By.cssSelector(css));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void clicarporCSS(String css) {
		
		driver.findElement(By.cssSelector(css)).click();
	} 
	
	
}
