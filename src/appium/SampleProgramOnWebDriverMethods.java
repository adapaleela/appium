package appium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgramOnWebDriverMethods 
{
    
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		String x=driver.getTitle();
		System.out.println(x);                       
		if(x.equalsIgnoreCase("google"))
		{
			System.out.println("site is launched");
		}
		else
		{
			System.out.println("site is not launched");
		}
		
		/*String y=driver.getPageSource();
		System.out.println(y);
		String z=driver.getCurrentUrl();
		if(z.contains("http"))
		{
			System.out.println("site is secured");
		} 
		else
		{
			System.out.println("site is not secured");
		}*/
		driver.quit();  
	}

}

