package jeinkin.demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParallelTestingDemo {
	public static WebDriver driver;
	@Test(priority=0)
	  public void test1() {
		//how to know thread count is working or not :we used Thread.currentThread().getId()
		  System.out.println("check test1 |"+" "+Thread.currentThread().getId());
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com/");
	  }
	@Test(priority=1)
	  public void test2() {
		  System.out.println("check test2 |"+" "+Thread.currentThread().getId());
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.youtube.com/");
	  }
	@Test(priority=2)
	  public void test3() {
		  System.out.println("check test3 |"+" "+Thread.currentThread().getId());
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://reqres.in/");
	  }
	@Test(priority=3)
	  public void test4() {
		  System.out.println("check test4 |"+" "+Thread.currentThread().getId());
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.w3schools.com/");
		
	  }
//	@Test(threadPoolSize =5,invocationCount = 5,timeOut=5000)
//	  public void test5() throws InterruptedException{
//		System.out.println("_________configure a single method to run run in multiple threads__________");
//		  System.out.println("check test5 |"+" "+Thread.currentThread().getId());
//		  WebDriverManager.chromedriver().setup();
//		  
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.navigate().to("https://www.w3schools.com/");
//			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//	  }
	 
	}
