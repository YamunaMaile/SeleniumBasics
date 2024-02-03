package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		
		WebElement currencyDropdownXpath=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		//if select tagname is present for dropdown then only we can use this select methods
		Select selectCurrencyOption= new Select(currencyDropdownXpath);
		selectCurrencyOption.selectByIndex(0);
		Thread.sleep(2000);
		System.out.println(selectCurrencyOption.getFirstSelectedOption().getText());
		selectCurrencyOption.selectByValue("INR");
		Thread.sleep(2000);
		System.out.println(selectCurrencyOption.getFirstSelectedOption().getText());
		selectCurrencyOption.selectByVisibleText("USD");
		Thread.sleep(2000);
	System.out.println(selectCurrencyOption.getFirstSelectedOption().getText());//It will print selected option because that is only selected currently in dropdown

	driver.quit();
}
}
