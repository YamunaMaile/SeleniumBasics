package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sessionCodeCheckbox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    // WebElement b=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
   //  b.click();
  
   //  b.sendKeys("hjk");
   
     
   List<WebElement> c=  driver.findElements(By.xpath("//input[@type='checkbox']"));
   
   System.out.println(c.size());
   
     //for each loop
   
   for(WebElement d:c) {
    
    d.click();
     String demo= d.getText();
     if(demo.equals(c)) {
      
     }
   }
     
WebElement a=driver.findElement(By.xpath("//div[@id='error']"));
System.out.println(a.getText());
   
   //for loop --if we want to select sepecifc elemets
/*                  
   for (int i = 0 ; i<c.size()-20; i++) {
           c.get(i).click();
   }
*/
//Checbox methods--
   
  
   WebElement d=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
   System.out.println(d.isDisplayed());  //True
   System.out.println(d.isEnabled());  //True   // can i
   System.out.println(d.isSelected()); //True


}
}