package vendorLogin;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
public class SupervisorManagement extends BaseClass {
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
}
@Test(priority = 1, enabled = true)
public void SupervisorManagement1() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/001SupManDropDown.png");
    FileUtils.copyFile(source, target); 
    //+timestamp()+"  
}
@Test(priority = 2, enabled = true)
public void SupervisorManagement2() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("info@g.com");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//p[contains(text(),'Add Supervisor')]")).click();
	Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/002CreateSupervisor.png");
    FileUtils.copyFile(source, target); 
    //+timestamp()+"  
}
@Test(priority = 3, enabled = true)
public void SupervisorManagement3() throws Throwable {
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("testing@pys");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567891");
	driver.findElement(By.xpath("//p[contains(text(),'Add Supervisor')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/003EmailWithout.com(or).in Atend.png");
    FileUtils.copyFile(source, target); 
    //+timestamp()+"  
}
@Test(priority = 4, enabled = true)
public void SupervisorManagement4() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("testing@pys");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567893");
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/004ExistingMobileNumber .png");
    FileUtils.copyFile(source, target); 
   WebElement failed = driver.findElement(By.xpath("//div[contains(text(),'Failed!')]"));
if (failed.isDisplayed()) {
	System.out.println("The test case failed as expected.Which indicates the test scenario passed.");
}
else {
System.out.println("There seems to be an error.");
}
}

@Test(priority = 5, enabled = true)
public void SupervisorManagement5() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("testing23@pys.com");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567897");
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/005EmptyNameField .png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 6, enabled = true)
public void SupervisorManagement6() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567893");
	driver.findElement(By.xpath("//p[contains(text(),'Add Supervisor')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/006EmptyEmailField .png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 7, enabled = true)
public void SupervisorManagement7() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("testing12@pys.com");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("");
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/007EmptyContactNumberField .png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 8, enabled = true)
public void SupervisorManagement8() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Create Supervisors')]")).click();
	driver.findElement(By.xpath("//input[@id='Supervisor Name']")).sendKeys("Testing Create");
	driver.findElement(By.xpath("//input[@id='Supervisor Email Id']")).sendKeys("testing45@pys.com");
	driver.findElement(By.xpath("//input[@id='Contact Number']")).sendKeys("1234567898");
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/008ExistingEmailID.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 9, enabled = true)
public void SupervisorManagement9() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'View Supervisors')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/009ViewSupervisorScreen.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 10, enabled = true)
public void SupervisorManagement10() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'View Supervisors')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/010DeleteSupervisor1.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 11, enabled = true)
public void SupervisorManagement11() throws Throwable {
	
	driver.findElement(By.xpath("//div[contains(text(),'Supervisors Management')]")).click();
	driver.findElement(By.xpath("//div[contains(text(),'View Supervisors')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/SupervisorManagement/011DeleteSupervisor2.png");
    FileUtils.copyFile(source, target); 
}




@AfterMethod
public void windowClose() {
	driver.close();
}
	
}
