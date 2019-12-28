package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui-checkboxradio-icon-space'])[3]/preceding-sibling::*)"));
		driver.switchTo().frame(e);
		if(e.isDisplayed())
		{
			System.out.println("is displayed");
		
		   if(e.isEnabled())
		   {
			 System.out.println("is enabled");
		        if(e.isSelected())
		        {
			       System.out.println("is selected");
		        }
			    else
			    {
			    	System.out.println("is not selected");
			    }
		   }
		   else
		   {
			   System.out.println("is not enabled");
		   }
		}
		else
		{
			System.out.println("is not displayed");
		}
		driver.close();
			
	}

}
