package appium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class DataDrivenUsingExcelOnWay2sms 
{

	public static void main(String[] args) throws Exception
	{
		//open and read excel file
		File f=new File("way2smsworkbook.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		WritableFont wf=null;
		WritableCellFormat wcf=null;
		ChromeDriver driver=null;
		wf=new WritableFont(WritableFont.ARIAL,15,WritableFont.BOLD);
		wf.setColour(Colour.GREEN);
		wcf=new WritableCellFormat(wf);
		wcf.setAlignment(Alignment.CENTRE);
		wcf.setWrap(true);
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		Date d=new Date();
		String colname=sf.format(d);
		Label l=new Label(nouc,0,colname);
		wsh.addCell(l);
		for(int i=1;i<nour;i++)
		{
			String mbno=rsh.getCell(0,i).getContents();
			String mbnoc=rsh.getCell(1,i).getContents();
			String pwd=rsh.getCell(2,i).getContents();
			String pwdc=rsh.getCell(3,i).getContents();
			
			
			try
			 {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("http://www.way2sms.com");
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='mobileNo'])[1]")));
				driver.manage().window().maximize();
				driver.findElement(By.xpath("(//*[@id='mobileNo'])[1]")).sendKeys(mbno);
				driver.findElement(By.xpath("(//*[@name='password'])[1]")).sendKeys(pwd);
				driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
				Thread.sleep(5000);
				
				 if(mbnoc.equalsIgnoreCase("valid") && pwdc.equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='SendSMS']")).isDisplayed())
				 {
					Label l1=new Label(nouc,i,"valid data test passed"); 
					l1.setCellFormat(wcf);
					wsh.addCell(l1);
				 }
				 else if(mbnoc.equalsIgnoreCase("mobileno_blank") && driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
				 {
					 Label l2=new Label(nouc,i,"blank mobile number test passed");
					 l2.setCellFormat(wcf);
					 wsh.addCell(l2);
				 }
				 else if(mbnoc.equalsIgnoreCase("wrongsize_mobileno") && driver.findElement(By.xpath("//*[text()='Enter valid mobile number']")).isDisplayed())
				 {
					 Label l3=new Label(nouc,i,"wrong size mobile number test passed");
					 l3.setCellFormat(wcf);
					 wsh.addCell(l3);
				 }
				 else if(mbnoc.equalsIgnoreCase("invalid_mobileno") && driver.findElement(By.xpath("//*[contains(text(),'not register with us')]")).isDisplayed())
				 {
					 Label l4=new Label(nouc,i,"invalid mobile number test passed");
					 l4.setCellFormat(wcf);
					 wsh.addCell(l4);
				 }
				 else if(pwdc.equalsIgnoreCase("password_blank") && driver.findElement(By.xpath("(//*[text()='Enter password'])[2]")).isDisplayed())
				 {
					 Label l5=new Label(nouc,i,"blank password test passed");
					 l5.setCellFormat(wcf);
					 wsh.addCell(l5);
				 }
				 else if(pwdc.equalsIgnoreCase("invalid_password") && driver.findElement(By.xpath("(//*[contains(text(),'Try Again')])[1]")).isDisplayed())
				 {
					 Label l6=new Label(nouc,i,"invalid password test passed");
					 l6.setCellFormat(wcf);
					 wsh.addCell(l6);
				 }
				 else
				 {
					 String screenshot=sf.format(d)+".png";
					 File src=driver.getScreenshotAs(OutputType.FILE);
					 File dest=new File(screenshot);
					 FileHandler.copy(src,dest);
					 Label l7=new Label(nouc,i,"test failes"+screenshot);
					 l7.setCellFormat(wcf);
					 wsh.addCell(l7);
				 }
				 driver.close();
			 }
			 catch(Exception ex)
			 {
				 Label l8=new Label(nouc,i,ex.getMessage());
				 l8.setCellFormat(wcf);
				 wsh.addCell(l8);
				 driver.close();
			 }
			
		}
		wwb.write();
		rwb.close();
		wwb.close();
	}

}
