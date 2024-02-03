package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forLoopToPrintWebEleAndMethods {

public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//dynamic dropdown
		List<WebElement> checkboxListXpath=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//WebElement checkboxNameXpath=driver.findElement(By.xpath("//label[@for='bmw']"));
		////label[normalize-space()='Option1']
		////option[normalize-space()='Option1']
		
		for(WebElement print: checkboxListXpath)
		{
			if(print.isDisplayed() && print.isEnabled() && print.getAttribute("value").equals("option2")) {
			print.click();
			String store=print.getAttribute("value");
			System.out.println(store);
			}
		}
		
		for(int i=0;i<checkboxListXpath.size();i++)
		{
			if(checkboxListXpath.get(i).isSelected())
			{
			checkboxListXpath.get(i).click();
		//String txt=checkboxListXpath.get(i).getAttribute("value");
			String txt=checkboxListXpath.get(i).getText();//need to check
		System.out.println(txt);
		}
		}
		

		
		
		driver.quit();
}
}
