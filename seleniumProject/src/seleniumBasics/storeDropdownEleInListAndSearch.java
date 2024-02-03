package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class storeDropdownEleInListAndSearch {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ind");
	      Thread.sleep(2000);
	      
	      //do not prefer below method to select any option through keys. Sometime sequence will get change then script will fail
	   /*   driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
	      driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
	      driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER);*/
	      
	     //searching Ind and selecting India from dropdown using condition
			List<WebElement> a = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
			for (WebElement b : a) {
				if (b.getText().equalsIgnoreCase("India")) {
					System.out.println("selecting india");
					b.click();
					break;
				}
			}
			
			
	      //increasing audult value by 5 in passenger dropdown
			driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
			Thread.sleep(4000);
			WebElement selectedPassengerXpath = driver.findElement(By.xpath("(//div[@class='ad-row-left']//label)[1]"));
			WebElement increaseAudltCountXpath = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));

			System.out.println("Selecting passenger is " + selectedPassengerXpath.getText());

			for (int i = 0; i < 4; i++) {
				increaseAudltCountXpath.click();
			}
           
			Thread.sleep(2000);
			String selectedAdultCount = driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
			System.out.println("selectedAdultCount is " + selectedAdultCount);

			driver.quit();
		}

}
