package appium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("(//*[text()='Downloads'])[1]"));
		Actions a =new Actions(driver);
		a.contextClick(e).build().perform();
		Thread.sleep(5000);
		Robot r=new Robot();
		for(int i=1;i<=2;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);                        
		/*r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);*/
		
		
		
	}

}
