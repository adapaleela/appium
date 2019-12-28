package appium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailCompose {
	public static void main(String args[]) throws InterruptedException, AWTException

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
		WebElement compose=driver.findElement(By.xpath("//*[text()='Compose']"));
		compose.click();
		driver.findElement(By.name("to")).sendKeys("hemasindhu511@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		Thread.sleep(5000);
		Robot r=new Robot();
		StringSelection s=new StringSelection("C:\\Users\\Lenovo\\Pictures\\Camera Roll\\WIN_20180421_17_56_15_Pro.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-tooltip='Send ‪(Ctrl-Enter)‬']")).click();
}
}
