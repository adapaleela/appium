package appium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cachee 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("virat kohli");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='sbl1']"));
		int count=l.size();
		int flag=0;
		System.out.println(count);
		/*for(int i=1;i<=count;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
			String x=driver.findElement(By.name("q")).getAttribute("value");
			System.out.println(x);
			if(x.equalsIgnoreCase("virat kohli images"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				flag=1;
				break;
		
			}
		}*/		
		driver.close();
	}

}
