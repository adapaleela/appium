package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    try
	    {
	    	WebElement e1=driver.findElement(By.xpath("(//*[@height='200px'])[1]"));
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	WebElement e2=driver.findElement(By.xpath("(//*[contains(text(),'Deals')])[2]"));
	    	//scrolling from top to bottom
	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	    	Thread.sleep(5000);
	    	//scrooling bottom to top
	    	//js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	    	//Thread.sleep(5000);
	    	//e2.click();
	    	//Thread.sleep(5000);
	    	//scroll to particular element
	    	//js.executeScript("arguments[0].scrollIntoView();",e1);          
	    	//Thread.sleep(10000);
	    	js.executeScript("arguments[0].scrollIntoView();",e2);
	    }
	    catch(Exception ex)
	    {
	    	System.out.println(ex.getMessage());
	    	driver.close();
	    }
	    	driver.close();
	}

}
 