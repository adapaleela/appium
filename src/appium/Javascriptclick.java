package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptclick {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click using javascript
		WebElement e1=driver.findElement(By.xpath("//*[@tabindex='29']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",e1 );
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value='nike airforce';", e2);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		
		
	}

}
