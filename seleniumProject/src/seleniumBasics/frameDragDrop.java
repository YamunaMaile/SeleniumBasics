package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameDragDrop {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium Setup\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//first find the frame xpath to go inside the frame
		WebElement iframeXpath=driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		
		//switching inside the frame to do drag and drop action
		driver.switchTo().frame(iframeXpath);
		
		//finding the element source and target
		WebElement dragEleXpath=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropEleXpath=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//using this Action class to do the drag and drop functionality inside the frame
		//if drag and drop is not available inside the frame and only button is available then no need to use Action class here
		//we can use simply switch().frame() and click on button
		Actions act=new Actions(driver);
		act.dragAndDrop(dragEleXpath, dropEleXpath).perform();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='http://jqueryui.com/sortable/']")).click();
		
}
	
}


/*
 * 
 * driver.get("http://jqueryui.com/droppable/");
		WebElement k=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(k); //This will switch control inside the frame
		
		Actions i=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		i.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); //This will swithc 
		
		*/
