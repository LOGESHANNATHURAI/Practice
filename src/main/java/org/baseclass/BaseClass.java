package org.baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert al;
	public static Select s;
	
	public static void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\GIT\\admin_urban_entry\\PYSV\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fillTextBox(WebElement name, String data) {
		name.sendKeys(data);

	}

	public static void btnClick(WebElement ele) {
		ele.click();

	}

	public static void clickDouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void contextClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick().perform();

	}

	public static void moveToElement(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele);

	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des);

	}

	public static void tabOption() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
	public static void escOption() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);

	}

	public static void scrollDownUp(Boolean yesorno, WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + yesorno + ")", ele);

	}

	public static void getAttribute(WebElement ele) {

		js = (JavascriptExecutor) driver;
		js.executeScript("returnarguments[0].getAttribute('value')" + ele);

	}

	public static void setAttribute(WebElement ele, String entervalue) {

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + entervalue + "'))" + ele);

	}

	public static void getScreenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("\\SampleMavenFramework\\Screenshot\\" + name + " .png");
		FileUtils.copyFile(src, des);

	}

	public static void acceptAlert() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

	}

	public void dismissAlert() {
		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();

	}

	public static void promptAlert(String data) {

		al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys(data);
		al.accept();

	}

	public static void switchFrame(WebElement ele) {

		driver.switchTo().frame(ele);

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void mainWindow() {

		driver.switchTo().defaultContent();
	}

	public static Select selectClass(WebElement ele) {
		s = new Select(ele);
		return s;

	}

	public static void handleWindow(String windowId) {

		driver.switchTo().window(windowId);
		System.out.println("ParenId" + driver.getWindowHandle());
		System.out.println("childId" + driver.getWindowHandles());

	}

	public static void unconditionalWait(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	@SuppressWarnings("deprecation")
	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	
	public static void ReadFromFile(String pathname,String sheetName,int rowNo,int cellNo) throws Throwable {
		
		File f=new File(pathname);
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		CellType type = c.getCellType();
		System.out.println(type);
		}
	
	public static void takescreenshot(){

	}
	public static void closeBrowser() {
		
		driver.close();
		

	}

}
