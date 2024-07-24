package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	BusquedaEbaypage busquedaEbaypage;
	
	public PageObjectManager (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public BusquedaEbaypage getBusquedaEbaypage() {
		busquedaEbaypage = new BusquedaEbaypage(driver);
		return busquedaEbaypage;
	}
}
