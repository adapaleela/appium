package appium;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumServerPgm 
{

	public static void main(String[] args) throws Exception
	{
		//open  cmd prompt and starting appium server
		Runtime.getRuntime().exec("calc.exe");
		
		//details of ip address and on which port appium server is running
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		
		//details of ard/avd and app which we r working on
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(CapabilityType.BROWSER_NAME,"");
		d.setCapability("deviceName","FM8S9PDE958LPVU4");
		d.setCapability("platformName","android");
		d.setCapability("platformVersion","7.1.1");
		d.setCapability("appPackage","com.oppo.music");
		d.setCapability("appActivity","com.oppo.music.MainListActivity");
		                                              // em mummy matladav
	}

}   