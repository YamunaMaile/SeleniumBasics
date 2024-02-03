package seleniumBasics;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandling {

	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Set<String> storeWindows=driver.getWindowHandles();//to store all open windows in set like parent and child window
		
		Iterator<String> iterator=storeWindows.iterator();//creating object to iterate the elements in Set
		
		String parent_Window=iterator.next();//storing first window in parent
		String child_Window=iterator.next();//storing second window in child
		
		driver.switchTo().window(parent_Window);//switched control to the parent window
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(child_Window);//switched control to the child window
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@style='position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Courses']")).click();
		
		Set<String> store_3wind=driver.getWindowHandles();
		Iterator<String> it=store_3wind.iterator();
		String child_window2=it.next();//storing third window 
		
	//	System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://www.rahulshettyacademy.com/#/index"))
			System.out.println("on third window - https://www.rahulshettyacademy.com/#/index");
		
		driver.switchTo().window(child_Window); //why it is not switching again on 2nd window
		Thread.sleep(4000);
		driver.switchTo().window(child_window2);//why it is not switching again on 3rd window
		Thread.sleep(4000);
		driver.switchTo().window(parent_Window);
		
		
}
}
