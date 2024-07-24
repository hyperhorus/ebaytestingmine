package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseGen {
WebDriver driver;
	
	public WebDriver WebDriverManager() throws Exception  {		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browString = prop.getProperty("browser");		
	
		if (driver == null) {			
			if(browString.equalsIgnoreCase("chrome") ) {
				driver = new ChromeDriver();
			}
			else  {
				//System.out.println("se fue aca!!! " );
				
			}
		
		driver.get(url);
		}
		return driver;
		
	}

}
