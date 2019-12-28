package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteSecuredOrNot 
{

	public static void main(String[] args) throws Exception
	{
		Sample1234 obj=new Sample1234();
		obj.launch();
		obj.select();
		obj.checkSiteISSecured();
		obj.login();
		obj.close();
		
	}

}
