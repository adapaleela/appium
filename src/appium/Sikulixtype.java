package appium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Sikulixtype {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    // filling data
	    Screen s=new Screen();
	    s.type("C:\\Users\\Lenovo\\Desktop\\google.png","youtube");
	    

	}

}
