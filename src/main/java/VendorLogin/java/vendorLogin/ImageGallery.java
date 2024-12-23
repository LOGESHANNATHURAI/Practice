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
public class ImageGallery extends BaseClass {
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
			driver.findElement(By.xpath("//div[contains(text(),'Image Gallery')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Upload Image')]")).click();
			driver.findElement(By.xpath("//div[@id='Image Type']")).click();
	}
@Test(priority = 1, enabled = true)
public void UploadImageGallery1() throws Throwable {
	driver.findElement(By.xpath("//p[@aria-label='Gallery Image']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='SubActivities ']")).click();
	driver.findElement(By.xpath("//p[@aria-label='Badminton']")).click();	
	Thread.sleep(7000);
	driver.findElement(By.xpath("//div[@class='mb-3']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//p[contains(text(),'Upload')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ImageGallery/001SelectingGalleryImage.png");
    FileUtils.copyFile(source, target); 
    //+timestamp()+"  
}	
@Test(priority = 2, enabled = true)
public void UploadImage2() throws Throwable {
			driver.findElement(By.xpath("//p[@aria-label='Gallery Image']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@id='SubActivities ']")).click();
			driver.findElement(By.xpath("//p[@aria-label='Badminton']")).click();	
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			Thread.sleep(2000);
			TakesScreenshot js = (TakesScreenshot)driver;
		    File source = js.getScreenshotAs(OutputType.FILE);
		    File target = new File("./screenshots/ImageGallery/002DeletingGalleryImage.png");
		    FileUtils.copyFile(source, target);
			driver.findElement(By.xpath("//div/button[contains(text(),'Cancel')]")).click();	    
}
@Test(priority = 3, enabled = true)
public void UploadImage3() throws Throwable {
	driver.findElement(By.xpath("//p[@aria-label='Profile Image']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='mb-3']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ImageGallery/003ProfileImage.png");
    FileUtils.copyFile(source, target);	    
}
@Test(priority = 4, enabled = true)
public void UploadImage4() throws Throwable {
	driver.findElement(By.xpath("//p[@aria-label='Vendor Banner']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='mb-3']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ImageGallery/004VendorBanner.png");
    FileUtils.copyFile(source, target);	    
}

@AfterMethod
public void windowClose() {
	driver.close();
}	
	
}
