package appium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDowns 
{

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//*[@class='dropdown example']"));
		System.out.println(l.size());
		//single select dropdown
		WebElement e1=driver.findElement(By.xpath("//*[@class='ui fluid search dropdown selection multiple']"));
		Actions a =new Actions(driver);
		a.click(e1).build().perform();
		Thread.sleep(5000);
		a.sendKeys("OHIO").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys("INDIA").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
