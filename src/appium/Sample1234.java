package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample1234

{
	public WebDriver driver=null;
	public void launch() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	public void login() throws Exception
	{

		driver.switchTo().activeElement().sendKeys("leela",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("leela1993",Keys.TAB);
		driver.switchTo().activeElement().click();
		Thread.sleep(5000);
	}
	
	public void checkSiteISSecured() throws Exception
	{
		String x=driver.getTitle();
		System.out.println(x);
		String y=driver.getCurrentUrl();
		System.out.println(y);
		if(y.contains("https"))
		{
			System.out.println("site is secured");
		}
		else
		{
			System.out.println("site is not secured");
		}
		Thread.sleep(5000);
	}

	public void close()
	{
		driver.close();
	}
	
	public void select() throws Exception
	{
		WebElement e=driver.findElement(By.xpath("//*[contains(text(),'Always')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",e);
		e.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(5000);
	}
}