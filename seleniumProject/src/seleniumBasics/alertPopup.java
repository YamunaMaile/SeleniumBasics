package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		 * 
		 * System.out.println(driver.switchTo().alert().getText()); Thread.sleep(2000);
		 * driver.switchTo().alert().accept(); Thread.sleep(2000);
		 * 
		 * driver.quit();
		 */

		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		// adult dropdown increase 9 times and handle alert

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(5000);

		WebElement plusIcon = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		for (int i = 0; i < 9; i++)
			plusIcon.click();

		// Switching to alert and getting the popup text
		System.out.println(driver.switchTo().alert().getText());

		// accept()- It will accept the alert that is automatically it will click on Ok
		// button
		driver.switchTo().alert().accept();

		// dismiss()- It will dismiss the alert that is automatically it will cancel the
		// alert popup
		// driver.switchTo().alert().dismiss();
		// Thread.sleep(2000);

		// if we try to accept and dismiss the popup both in one flow then it will throw
		// exception- Exception in thread "main"
		// org.openqa.selenium.NoAlertPresentException: no such alert

		// driver.quit();
	}

}
