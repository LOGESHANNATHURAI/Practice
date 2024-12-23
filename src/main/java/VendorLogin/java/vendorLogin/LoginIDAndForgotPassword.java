package vendorLogin;

import java.time.Duration;
import java.util.Scanner;
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
public class LoginIDAndForgotPassword extends BaseClass{
	public static WebDriver driver;
	public static Actions action;
@BeforeMethod
	public void weblogin() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\GIT\\admin_urban_entry\\PYSV\\Drivers\\geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://13.127.126.165:3000/login");
}
@Test(priority = 1, enabled = true)
public void validIdvalidPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8778544520");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/001ValidId ValidPass.png");
    FileUtils.copyFile(source, target);
    //+timestamp()+"
}
@Test(priority = 2, enabled = true)
public void inValidIdvalidPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("877854452");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/002InValidId ValidPass.png");
    FileUtils.copyFile(source, target);

}
@Test(priority = 3, enabled = true)
public void validIdInValidPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8778544520");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/003ValidId InValidPassword.png");
    FileUtils.copyFile(source, target);
   
}
@Test(priority = 4, enabled = true)
public void inValidIdInValidPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("877854452");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/004InValidId InValidPassword.png");
    FileUtils.copyFile(source, target);   
}
@Test(priority = 5, enabled = true)
public void noIdnoPass() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/005NOId NoPassword.png");
    FileUtils.copyFile(source, target);   
}
@Test(priority = 6, enabled = true)
public void validIdNoPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8778544520");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/006ValidId NoPassword.png");
    FileUtils.copyFile(source, target);   
}
@Test(priority = 7, enabled = true)
public void noIdIdValidPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/Loginpage/007NoId ValidPassword.png");
    FileUtils.copyFile(source, target);   
}
@Test(priority = 8, enabled = true)
public void forgotpassword0() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544520");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	driver.findElement(By.xpath("//input[@type=\"password\" and @aria-invalid='false'][1]")).sendKeys("098765"); 
	driver.findElement(By.xpath("//input[@id=':r5:']")).sendKeys("098765");
    Scanner sc = new Scanner(System.in);
    System.out.print("TYPE THE OTP: ");
    String otp=sc.next();
    driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")).sendKeys(otp);
    driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/008forgot password.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 9, enabled = true)
public void forgotpassword1() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/009No phno or email.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 10, enabled = true)
public void forgotpassword2() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544529");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/010Incorrect Phno or email.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 11, enabled = true)
public void forgotpassword3() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544520");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	driver.findElement(By.xpath("//input[@type=\"password\" and @aria-invalid='false'][1]")).sendKeys("098765"); 
    Scanner sc = new Scanner(System.in);
    System.out.print("TYPE THE OTP: ");
    String otp=sc.next();
    driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")).sendKeys(otp);
    driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/011Only Pass and OTP.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 12, enabled = true)
public void forgotpassword4() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544520");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	driver.findElement(By.xpath("//input[@type=\"password\" and @aria-invalid='false'][1]")).sendKeys("098765"); 
	driver.findElement(By.xpath("//input[@id=':r5:']")).sendKeys("098765");
    driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/012Only Pass and ConPass.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 13, enabled = true)
public void forgotpassword5() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544520");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	driver.findElement(By.xpath("//input[@type=\"password\" and @aria-invalid='false'][1]")).sendKeys("098765"); 
	driver.findElement(By.xpath("//input[@id=':r5:']")).sendKeys("098764");
    Scanner sc = new Scanner(System.in);
    System.out.print("TYPE THE OTP: ");
    String otp=sc.next();
    driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")).sendKeys(otp);
    driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/013Mismatch Pass and ConPass.png");
    FileUtils.copyFile(source, target); 
}
@Test(priority = 14, enabled = true)
public void forgotpassword6() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
	driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("8778544520");
	driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
	driver.findElement(By.xpath("//input[@id=':r5:']")).sendKeys("098765");
    Scanner sc = new Scanner(System.in);
    System.out.print("TYPE THE OTP: ");
    String otp=sc.next();
    driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")).sendKeys(otp);
    driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    Thread.sleep(1000);
	TakesScreenshot js = (TakesScreenshot)driver;
    File source = js.getScreenshotAs(OutputType.FILE);
    File target = new File("./screenshots/ForgotPassword/014Only ConPass and OTP.png");
    FileUtils.copyFile(source, target); 
}

@AfterMethod
public void windowClose() {
	driver.close();
}
}
