package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotsInSelenium {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//full screenshot
						//this is method to take ss and giving driver as reference.
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//we are storing in files so selecting output type is file
		
							//source from where we taken ss		destination-where we have to give folder path to store the taken ss 
		FileUtils.copyFile(screenshot, new File("C:\\Users\\HP\\eclipse-workspace\\seleniumProject\\src\\Screenshots\\Screenshot.png"));
		//FileUtils.copyFile(src, new File("C:\\Users\\bhagy\\screenshot.png"));

		
		//partially screenshot using webelement
		WebElement nametxtXpath=driver.findElement(By.xpath("//input[@id='name']"));
		File sc=nametxtXpath.getScreenshotAs(OutputType.FILE);//It will take only webelement screenshot. Here we have to pass webelement not a driver reference
		FileUtils.copyFile(sc, new File("C:\\Users\\HP\\eclipse-workspace\\seleniumProject\\src\\Screenshots\\Screenshot1.png"));
}
}

//add jars --https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0