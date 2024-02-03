package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsHandling {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.naukri.com/nlogin/login");
			
		driver.get("https://www.naukri.com/");
		System.out.print(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/browse-jobs']")).click();
		System.out.println(driver.getCurrentUrl());

		//below commented code will not work. control is on parent tab and we trying to click recruiters tab on child tab
		/*
		 * driver.findElement(By.xpath("//a[@href='https://www.naukri.com/recruiters']")
		 * ).click(); System.out.println(driver.getCurrentUrl());
		 */
		
		
		Set<String> storeTabs=driver.getWindowHandles();//use array list as well to store all tabs and use index numbers for switching
		Iterator<String> it=storeTabs.iterator();
		String firTab=it.next();//first parent naukri page//clicking on jobs
		String secTab=it.next();//Job child
		//String thirdTab=it.next();//recruiters child
		
		driver.switchTo().window(secTab);
		System.out.print(driver.getCurrentUrl());
		
		
		  driver.findElement(By.xpath("//a[@href='https://www.naukri.com/recruiters']") ).click(); 
		  
		  Set<String> store3rdTab=driver.getWindowHandles();
		  Iterator<String> it1=store3rdTab.iterator();
		  
		String thirdTab= it1.next();//recruiters child
		 driver.switchTo().window(thirdTab);
		 System.out.println(driver.getCurrentUrl());//not getting ??
		 
		 
		
		////div[@class='sumome-react-svg-image-container']
		
}
}
