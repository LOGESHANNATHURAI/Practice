package vendorLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\GIT\\admin_urban_entry\\PYSV\\Drivers\\geckodriver.exe");
		
			WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://13.127.126.165:3000");
		}
}
