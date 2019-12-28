package appium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailActionsClass 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement uid=driver.findElement(By.name("identifier"));
		WebElement nxt=driver.findElement(By.xpath("//*[text()='Next']"));
		Actions a=new Actions(driver);
		a.sendKeys(uid,"adapa.leeladevi").build().perform();
		Actions b=new Actions(driver);
		b.click(nxt).build().perform();		
		
	}

}
