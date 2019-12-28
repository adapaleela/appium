package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableAnElement 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('disabled', 'true');",e);
		Thread.sleep(5000);
		js.executeScript("arguments[0].removeAttribute('disabled');",e);
		//driver.switchTo().activeElement().sendKeys();
		Thread.sleep(5000);
		driver.close();
	
	}

}
