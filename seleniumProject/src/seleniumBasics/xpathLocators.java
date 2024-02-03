package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		//finding elements by xpath and syntax- //tagname[@attribute='value']  
		
		/*
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testing");
		 * driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("testing");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */
		
		//finding elements by css and syntax- tagname[attribute='value']  
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("test");
		
		
		//									//parent			//child[occurrence]
		//xpath - parent and child- syntax- (//parenttagname[@id='value']//childtagname)[1]
		//take first or immediate parent. Don't take grandparent 
		//find the element if it is more than 8 than refresh the page again to check its place is same or not. It should same.
		//if we want to find dynamic elements then use parent//child xpath
		//first refer the single slash in parent/child or child/parent. 
		//If it is not finding then go with double slash ex. parent//child or child//parent
		
		driver.findElement(By.xpath("(//form[@name='login']//input)[21]")).sendKeys("test");
		
		//if parent xpath is dynamic value then refer  child//parent xpath
		//child to parent xpath- child/parent
		
		
									//child					/parent
		//driver.findElement(By.xpath("//a[@id='mydomainLink']/parent::div")).click();- how we can identify domain link using child/parent xpath?
		//---> if child is present then only we can identify it
		
		driver.findElement(By.cssSelector("div[class='w0 links bt pt16 mb20'] a:nth-child(2)")).click();//--some time not working??
		
		//driver.findElement(By.xpath("(//div[@class='w0 links bt pt16 mb20']/a)[2]")).click();
		Thread.sleep(5000);
		
		//Css- parent/child . It will consider hidden tags as well but Xpath will not consider hidden tags
		
		driver.findElement(By.cssSelector("div[id='mydomainContainer'] button:nth-child(6)")).click();
		
      driver.quit();
		//driver.close();
	}
}
