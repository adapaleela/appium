package appium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailMailBox 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("adapa.leeladevi");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("leela1993");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		List<WebElement> l=driver.findElements(By.xpath("(//table)[7]/tbody/tr/td"));
		System.out.println(l.size());

	}

}
