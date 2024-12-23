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
public class PYSDashBoard extends BaseClass {
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
public void Dashboardwindow() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/001DashboardProfileButton.png");
    FileUtils.copyFile(source, target); 
    //+timestamp()+"  
}
@Test(priority = 2, enabled = true)
public void ChangePassword() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("654321");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("654321");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/002ChangePassword.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 3, enabled = true)
public void ChangePassConfirmPassWrong() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("654321");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("65432");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/003ChangePasswordConfirmPassWrong.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 4, enabled = true)
public void ChangePassCurrentPassWrong() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("12345");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("654321");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("654321");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/004ChangePasswordCurrentPassWrong.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 5, enabled = true)
public void ChangePassNewPassWrong() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("65432");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("654321");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/005ChangePasswordNewPassWrong.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 6, enabled = true)
public void ChangePassEmptyCurrentPassField() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("65432");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("654321");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/006ChangePasswordEmptyCurrentPassField.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 7, enabled = true)
public void ChangePassEmptyNewPassField() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("654321");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/007ChangePasswordEmptyNewPassField.png");
    FileUtils.copyFile(source, target);    
}
@Test(priority = 8, enabled = true)
public void ChangePassEmptyConfirmPassField() throws Throwable {
	driver.findElement(By.xpath("//button/div/img[@alt='photoURL']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("654321");
	driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("");
	driver.findElement(By.xpath("//button/p[contains(text(),'Update Password')]")).click();
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/PYSDashboard/008ChangePasswordEmptyConfirmPassField.png");
    FileUtils.copyFile(source, target);    
}



@AfterMethod
public void windowClose() {
	driver.close();
}
}