package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePgmOnGoogle 
{

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("leela");
		Thread.sleep(5000);
		e.clear();
		Thread.sleep(5000);
		String x=e.getAttribute("class");
		System.out.println(x);
		Thread.sleep(5000);
	    String y=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(y);
		String z=e.getCssValue("color");
		System.out.println(z);
		driver.close();

	}

}
