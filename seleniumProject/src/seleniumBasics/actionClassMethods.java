package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionClassMethods {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Action class to perform keyboard action
		Actions keyBoardAction = new Actions(driver); //use is to perform mouse actions

		WebElement openTabXpath= driver.findElement(By.xpath("//a[@id='opentab']"));
		WebElement mouseOverElement=driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement option1CheckboxXpath=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		//right click on particular button/element
		keyBoardAction.contextClick(openTabXpath).perform();
		Thread.sleep(4000);
		
		// double click
		keyBoardAction.doubleClick(option1CheckboxXpath).perform(); //when we can use this method??-- when we require double click then only use it
		Thread.sleep(4000);
		
		// movetoelement()
		keyBoardAction.moveToElement(mouseOverElement).perform(); 
		//Action mouseOver=keyBoardAction.moveToElement(mouseOverElement).build(); //what is diff between in above line and this&below line??- both are same
		//but  Actions is the class and inside that Action is the interface to use the Actions class methods
		//mouseOver.perform();
		//Action mouseOver=keyBoardAction.contextClick().build();
		//mouseOver.perform();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
