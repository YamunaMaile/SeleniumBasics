package seleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//creating java script executor object to scroll the page
		JavascriptExecutor obj=(JavascriptExecutor)driver; //converting driver into java obj for scrolling purpost
		
		obj.executeScript("window.scrollBy(0,400)"); //scroll down
		Thread.sleep(5000);
		System.out.println("Scroll down is done");
		
		obj.executeScript("window.scrollBy(0,-200)");//scroll up is minus value
		Thread.sleep(5000);
		System.out.println("Scroll up is done");
		
	//	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		obj.executeScript("window.scrollBy(0,500)"); //again scroll down side
		Thread.sleep(5000);
		System.out.println("again Scroll up is done");
		
		obj.executeScript("window.scrollBy(500,0)"); //scroll right side
		Thread.sleep(5000);
		System.out.println("Scroll right is done");
		
		obj.executeScript("window.scrollBy(-400,0)"); //scroll left side is minus value
		Thread.sleep(5000);
		System.out.println("Scroll left is done ");
		
		driver.quit();
	}
}
