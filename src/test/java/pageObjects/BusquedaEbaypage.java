package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaEbaypage {

	WebDriver driver;
	
	public BusquedaEbaypage (WebDriver driver) {
		this.driver = driver;
	}
		
	By searchBox = By.id("gh-ac");
	By searchButton = By.id("gh-btn");
	By priceItemsBy = By.xpath("(//div[@class='srp-river-results clearfix'])//span[@class='s-item__price']");
	
	public void buscaSearchBox(String producto) {
		driver.findElement(searchBox).sendKeys(producto);
	}
	
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
	
	
	public List<WebElement> priceListItems() {
		List<WebElement> laLista =  driver.findElements(priceItemsBy);
		//System.out.println(laLista.size());
		return laLista;
		
	}
	
}
