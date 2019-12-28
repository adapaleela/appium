package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightAnElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px blue dotted';",e1);
	}

}
