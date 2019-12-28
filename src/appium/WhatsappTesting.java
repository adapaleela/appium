package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class WhatsappTesting 
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
		dc.setCapability("appPackage","com.whatsapp");
		dc.setCapability("appActivity","com.whatsapp.HomeActivity");
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
		Thread.sleep(10000);
		WebElement e=driver.findElementByAccessibilityId("com.whatsapp:id/eula_accep");
		TouchAction a=new TouchAction(driver);
		a.tap(ElementOption.element(e)).perform();
		Thread.sleep(10000);
		//driver.findElementByAndroidUIAutomator("new UiSelector.resourceId(\"com.whatsapp:id/eula_accept\")").click();
		driver.findElement(By.xpath("//*[text()='phone number']")).sendKeys("7674864149");
		driver.findElement(By.xpath("//*[text()='NEXT']")).click();
		//driver.findElementByAndroidUIAutomator("new UiSelector.text(\"AGREE AND CONTINUE\")").click();
		//driver.findElement(By.xpath("//*[text()='AGREE AND CONTINUE']")).click();
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
