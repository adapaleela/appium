package appium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class  CalcJavaRobot
{
	public static void main(String args[]) throws Exception
	{
		Runtime.getRuntime().exec("calc.exe");
		StringSelection x=new StringSelection("500");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(5000);
		StringSelection y=new StringSelection("456");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyPress(KeyEvent.VK_EQUALS);
		//r.keyPress(KeyEvent.VK_ALT);
		//r.keyPress(KeyEvent.VK_F4);
		
		
		
		
	}
}
