package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	WebDriver driver;
	public String busquedaEbay;
	public TestBaseGen testBaseGen;
	public PageObjectManager pageObjectManager;
	
	
	public TestContextSetup() throws Exception{
		testBaseGen = new TestBaseGen();
		pageObjectManager = new PageObjectManager(testBaseGen.WebDriverManager());
		
		
	}
}
