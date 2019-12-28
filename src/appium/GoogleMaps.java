package appium;



import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class GoogleMaps 
{

	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","FM8S9PDE958LPVU4");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.1.1");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage","com.google.android.apps.maps");
		dc.setCapability("appActivity","com.google.android.maps.MapsActivity");
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
		//click on YOU ARE HERE
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement e=driver.findElement(By.name("xxxxxx"));
			wait.until(ExpectedConditions.elementToBeClickable(By.name("xxx")));
			e.click();
			int x=e.getLocation().getX();
			int y=e.getLocation().getY();
			int w=e.getSize().getWidth();
			int h=e.getSize().getHeight();
			//Zoom an element
			TouchAction ta1=new TouchAction(driver);
			ta1.press(ElementOption.point(x+w/2,y+h/2-20)).moveTo(ElementOption.point(x+w/2,y+h/2-120)).release();
			TouchAction ta2=new TouchAction(driver);
			ta2.press(ElementOption.point(x+w/2,y+h/2+20)).moveTo(ElementOption.point(x+w/2,y+h/2+120)).release();
			MultiTouchAction ma=new MultiTouchAction(driver);
			ma.add(ta1).add(ta2).perform();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
