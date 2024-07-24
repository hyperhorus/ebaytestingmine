package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BusquedaEbaypage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestContextSetup;

public class BusquedaEbayPage_Definition {
	
	BusquedaEbaypage busquedaEbaypage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	GenericUtils genericUtils;
	
	public BusquedaEbayPage_Definition(TestContextSetup testContextSetup) throws Exception {
		this.testContextSetup = testContextSetup;
		busquedaEbaypage = new BusquedaEbaypage(testContextSetup.testBaseGen.WebDriverManager());
		genericUtils = new GenericUtils(testContextSetup.testBaseGen.WebDriverManager());
	}
	
	@Given("Entrar a la pagina de eBay")
	public void entrar_a_la_pagina_de_e_bay() {
		
	    
	}
	@When("El usuario busca una pantalla {string} de {int} pulgadas")
	public void el_usuario_busca_una_pantalla_de_pulgadas(String str1, Integer int1) {
		busquedaEbaypage.buscaSearchBox(str1);
		busquedaEbaypage.clickSearchButton();		
		List<WebElement> miLista = busquedaEbaypage.priceListItems();
		System.out.println("Numero de elementos " + miLista.size());
		for(WebElement x:miLista) {
		 System.out.println("Valor del texto " + x.getText());
		}
	   
	}
	@Then("Ver que número de productos se desplegaron")
	public void ver_que_número_de_productos_se_desplegaron() {
	    
	}
}
