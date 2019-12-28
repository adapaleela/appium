package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclickactions 
{

	public static void main(String[] args) throws Exception
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.switchTo().frame("iframeResult");
	 WebElement e=driver.findElement(By.xpath("(//*[contains(text(),'Double-click')])[1]"));
	 Actions a=new Actions(driver);
	 a.doubleClick(e).build().perform();
	 driver.switchTo().alert().accept();
	 driver.close();
	}

}
