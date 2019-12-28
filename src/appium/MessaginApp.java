package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class MessaginApp 
{

	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","FM8S9PDE958LPVU4");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability("appPackage","com.android.mms");
		dc.setCapability("appActivity","com.android.mms.ui.ConversationList");
		AndroidDriver driver;
		while(2>1)
		{
			try
			{
			driver=new AndroidDriver(u,dc);
			break;
			}
			catch(Exception ex)
			{
			}
		}
		Thread.sleep(5000);
		/*WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByAccessibilityId("com.android.mms:id/action_new")));
		//WebElement search=driver.findElement(By.xpath("//*[@text='Search Messages']"));
		WebElement newcontact=driver.findElementByAccessibilityId("com.android.mms:id/action_new");
		newcontact.click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByAccessibilityId("com.android.mms:id/recipients_editor")));
		WebElement recipient=driver.findElementByAccessibilityId("com.android.mms:id/recipients_editor");
		recipient.sendKeys("Varun Home",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Text Message']")));
		WebElement messagebox=driver.findElement(By.xpath("//*[@text='Text Message']"));
		messagebox.sendKeys("hello");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SIM1 Send']")));
		WebElement sim1=driver.findElement(By.xpath("//*[@text='SIM1 Send']"));
		sim1.click();*/
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
