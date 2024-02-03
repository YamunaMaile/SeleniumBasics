package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFirstProgram {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
	
		//webdriver is interface	-Remote web driver- //chomedriver is class
		//remote web driver- it will implement interface webdriver methods- ex- driver.get(); and those implemented methods will use by classes
		WebDriver driver = new ChromeDriver();
		
		//to navigate the particular website
        driver.get("https://www.amazon.com/");
        
        //we can use another method to launch the browser, because it will not wait until the complete page load. so will use get() to launch. 
       // driver.navigate().to("https://www.amazon.com/");

        //to get current website url which is opened
        System.out.println("getCurrentUrl() -"+driver.getCurrentUrl());
        
        //to get current website title from opened tab
      System.out.println("getTitle() -"+driver.getTitle());
      
      //to navigate back
      driver.navigate().back();
      
      //wait some time
      Thread.sleep(2000);
      
      //to navigate forward
      driver.navigate().forward();
      
      //to refresh the page
      driver.navigate().refresh();
      
      //to close the recently/last opened only one browser
      driver.close();
      
      //to close all opened browsers(same chrome browsers or diff browsers IE, firefox etc..) which are mentioned in runned script
      // driver.quit()- it will close all browsers which are mentioned in runned script,
      //it won't close previously opened browser(before running script).
     // For that we have to close the previously browser manually.
    //  driver.quit();
      
      
    //  after close the browser we try to use any method - it will throw invalid session id, 
      //after quit the browser we try to use any method= it will throw null session id
      
      //  IF we try to use any method after driver.close it will give invalid session id
      // IF we try to use any method after driver.quit it will give null session id   
      
      
      /*get() is used to navigate particular URL(website) and wait till page load. driver and it will not maintain history or cookies. Method is not available for get() 
      navigate() is used to navigate to particular URL and does not wait to page load and  
  	it maintains browser history or cookies to navigate back or forward.*/
      
      


	}
}
