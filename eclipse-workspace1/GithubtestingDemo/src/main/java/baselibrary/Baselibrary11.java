package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary11 {
	public static WebDriver driver;
	public void getLaunchUrl(String url) {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		
	
		   
	}
	
	
	}
