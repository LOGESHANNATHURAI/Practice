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
public class Complaints extends BaseClass {
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
		driver.findElement(By.xpath("//div[contains(text(),'Complaints')]")).click();
		
	}
	
@Test(priority = 1, enabled = true)
	public void Complaints1() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Create Complaints')]")).click();
		driver.findElement(By.xpath("//div[@id='Complaint Type']")).click();
		driver.findElement(By.xpath("//p[@aria-label='BOOKING']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='  Type here']")).sendKeys("There is a problem in Bookings");
		driver.findElement(By.xpath("//p[contains(text(),'Submit Complaints')]")).click();
		Thread.sleep(2000);
		TakesScreenshot js = (TakesScreenshot)driver;
	    File source = js.getScreenshotAs(OutputType.FILE);
	    File target = new File("./screenshots/Complaints/001CreateComplaintTypeBookings.png");
	    FileUtils.copyFile(source, target); 
	}
@Test(priority = 2, enabled = true)
public void Complaints2() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Create Complaints')]")).click();
	driver.findElement(By.xpath("//div[@id='Complaint Type']")).click();
	driver.findElement(By.xpath("//p[@aria-label='OFFER']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='  Type here']")).sendKeys("There is a problem in Offers posted");
	driver.findElement(By.xpath("//p[contains(text(),'Submit Complaints')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Complaints/003CreateComplaintTypeOffer.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 3, enabled = true)
public void Complaints3() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Create Complaints')]")).click();
	driver.findElement(By.xpath("//div[@id='Complaint Type']")).click();
	driver.findElement(By.xpath("//p[@aria-label='PAYMENT']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='  Type here']")).sendKeys("There is a problem in Online Payment");
	driver.findElement(By.xpath("//p[contains(text(),'Submit Complaints')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Complaints/003CreateComplaintTypePayment.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 4, enabled = true)
public void Complaints4() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Create Complaints')]")).click();
	driver.findElement(By.xpath("//div[@id='Complaint Type']")).click();
	driver.findElement(By.xpath("//p[@aria-label='SLOTS']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='  Type here']")).sendKeys("There is a problem in Certain Slots");
	driver.findElement(By.xpath("//p[contains(text(),'Submit Complaints')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Complaints/004CreateComplaintTypeSlots.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 5, enabled = true)
public void Complaints5() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'View Complaints')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Complaints/005ViewComplaints.png");
    FileUtils.copyFile(source, target); 
}	
	
	
@AfterMethod
	public void windowClose() {
		driver.close();
	}	
}

