package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchSite 
{
	public ChromeDriver driver;
	@Test(priority=0)
	public void launch() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void fillUserid() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("adapa.leeladevi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	
	@Test(priority=2)
	public void fillPassword() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("leela1993");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	
	@Test(priority=3)
	public void closeSite()
	{
		driver.close();
	}
}
