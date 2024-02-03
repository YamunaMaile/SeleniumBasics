package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		
		WebElement fromCityDropDownXpath=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));

		fromCityDropDownXpath.click();
		
		WebElement selectingFromCityDropDownXpath= driver.findElement(By.xpath("//a[@text='Delhi (DEL)']"));
		// WebElement selectingFromCityDropDownXpath= driver.findElement(By.xpath("//a[@value='DEL']"));
		selectingFromCityDropDownXpath.click();
		Thread.sleep(4000);//to load the page and find the next element
		
		//WebElement selectingToCityFromDropDownXpath=driver.findElement(By.xpath("(//a[@text='Pune (PNQ)'])[2]"));
		WebElement selectingToCityFromDropDownXpath=driver.findElement(By.xpath("(//a[@text='Mumbai (BOM)'])[2]"));
		selectingToCityFromDropDownXpath.click();
	}
}
