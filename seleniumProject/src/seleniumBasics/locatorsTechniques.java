package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//id---
//classname--
//name
//tagname
//xpath
//css
//link text
//partial link text

public class locatorsTechniques {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://login.salesforce.com/?locale=in");
	   
	   //to find the username textbox id and pass the value/username
	   driver.findElement(By.id("username")).sendKeys("test1");
	   driver.findElement(By.id("password")).sendKeys("test1");
	   
	   //to click on login button
	  // driver.findElement(By.name("Login")).click();
	
	   //to click on link text using full text
	   driver.findElement(By.linkText("Use Custom Domain")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("hint_back_domain")).click();
	   Thread.sleep(2000);
	   
	   //to click on partial link text- giving partial text 
	  driver.findElement(By.partialLinkText("Forgot Your")).click();
	  Thread.sleep(2000);
	 
	 driver.close();//its throwing exception because we are on another page, how we can close the browser?
	}
}
