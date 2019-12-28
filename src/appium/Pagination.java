package appium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination {
	public static void main(String args[]) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","E:\\testing\\way2sms\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("adapa.leeladevi");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("leela1993");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		//driver.findElement(By.className("RveJvd snByac")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Compose']"))));
		int expected_mails=0;
		do
		{
			WebElement mailbox=driver.findElement(By.xpath("(//table)[6]"));
			List<WebElement> mails=mailbox.findElements(By.tagName("tr"));
			int nomp=mails.size();
			expected_mails=expected_mails+nomp;
		try
		{
			if(driver.findElement(By.xpath("//*[@data-tooltip='Older']")).getAttribute("aria-disabled").equals("true"))
			{
				break;
			}
		}	
		catch(Exception e)
		{
			driver.findElement(By.xpath("//*[@data-tooltip='Older']")).click();
		Thread.sleep(5000);
		}
		}while(2>1);
		String Actual_count=driver.findElement(By.xpath("//*[@data-tooltip='Newer']/preceding::span[1]")).getText();
		double anoc=Double.parseDouble(Actual_count);
		if(anoc==expected_mails)
		{
			System.out.println("testPass");
		}
		else
		{
			System.out.println("testFail");
		}
	}
}