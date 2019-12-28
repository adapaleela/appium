package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLASSS 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.name("s"));
		//WebElement click=driver.findElement(By.xpath("//*[@type='submit']"));
		//Actions a=new Actions(driver);
		//a.sendKeys(search,"leela").build().perform();
		//a.click(click).build().perform();
		Thread.sleep(5000);
		WebElement mousehover=driver.findElement(By.xpath("//*[text()='Contribute']"));
		Actions c=new Actions(driver);
		c.moveToElement(mousehover).build().perform();
		
		
			
		

	}

}
