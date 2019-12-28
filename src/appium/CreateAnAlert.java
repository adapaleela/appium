package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAnAlert 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("alert('hi leela, how is your best frd');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		WebElement e1=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttritube", arg1)
		
		
		
	}

}
