package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Verticalslider {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e4=driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions a1=new Actions(driver);
		a1.dragAndDropBy(e4,0,65).build().perform(); 
		Thread.sleep(5000);
		a1.dragAndDropBy(e4,0,22).build().perform();
		Thread.sleep(5000);
	    driver.close();
	}

}
