package vendorLogin;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class ReportGeneration extends BaseClass {
	public static WebDriver driver;
	public static Actions action;
	
@BeforeMethod
	public void weblogin() throws Throwable {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\GIT\\admin_urban_entry\\PYSV\\Drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				driver.get("http://13.127.126.165:3000/login");
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8778544520");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(text(),'Report Generation')]")).click();
				driver.findElement(By.xpath("//div[contains(text(),'Vendor Wise Report')]")).click();
				driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
}
@Test(priority = 1, enabled = true)
public void VendorWiseReoprt1() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'1')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'30')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(text(),'Download')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ReportGeneration/001VendorWiseReport.png");
    FileUtils.copyFile(source, target); 
}




@AfterMethod
public void windowClose() {
	driver.close();
}	

}