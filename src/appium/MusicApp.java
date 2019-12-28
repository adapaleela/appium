package appium;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MusicApp 
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
		//dc.setCapability("automationName","uiautomator2");
		dc.setCapability("appPackage","com.oppo.music");
		dc.setCapability("appActivity","com.oppo.music.MainListActivity");
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
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
