package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxSelection {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to store single/one element in list and data type is WebElement
		WebElement checkboxOption1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		//to store multiple elements in list and data type is WebElement
		List<WebElement> checkboxXpath= driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement> radioButtonXpath=driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println("size of checkbox list is="+checkboxXpath.size());//to check the size of list
		
		//selecting 3 checkboxes using foreach loop
		for(WebElement val:checkboxXpath)
		{
			val.click();
		}
		
		
		//To select the radio buttons
		for(WebElement val:radioButtonXpath)
		{
			val.click();
		}
		
		
		
		driver.quit();
	}
}
