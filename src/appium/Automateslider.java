package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automateslider {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e1=driver.findElement(By.xpath("//*[@id='slider']/child::*"));
		//horizantal slider
		Actions a=new Actions(driver);
		//left to right
		a.dragAndDropBy(e1,200,0).build().perform();
		Thread.sleep(5000);
		//right to left
		a.dragAndDropBy(e1,-200,0).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		//vertical sliderra
		driver.findElement(By.xpath("//*[@class='active']")).click();
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arugemts[0].scrollIntoView();",e3);
		e3.click();*/
		driver.switchTo().frame(0);
		WebElement e4=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions a1=new Actions(driver);
		a1.dragAndDropBy(e4,0,45).build().perform(); 
		Thread.sleep(5000);
		a1.dragAndDropBy(e4,0,90).build().perform();
	    driver.close();
	}

}
