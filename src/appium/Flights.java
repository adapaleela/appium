package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/flights-from-hyderabad/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.xpath("(//*[@name='radio'])[2]"));
		if(e.isDisplayed())
		{
			System.out.println("is displayed");
			if(e.isEnabled())
			{
				System.out.println("is enabled");
				e.click();
				if(e.isSelected())
				{
					System.out.println("is selected");
				}
				else
				{
					System.out.println("not selected");
				}
			}
			else
			{
				System.out.println("not enabled");
			}
		}
		else
		{
			System.out.println("not dispalyed");
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
