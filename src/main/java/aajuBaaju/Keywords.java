package aajuBaaju;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.HomePage;

import org.apache.commons.io.FileUtils;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Keywords {
	static Properties config= Utils.loadProperties("config2//setupDetails.properties");
	
    // static String url="https://aajubaaju.in";
	static WebDriver driver;
	//static String chrome,firefox;
	
	HomePage homepage= new HomePage(driver);
	
	public void switchToFrame() {
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		//driver.switchTo().frame("FileUpload");
		//driver.switchTo().frame(driver.findElement(By.xpath("")));
driver.findElement(By.xpath("Browse")).click();
driver.findElement(By.xpath("//*[@type='File']")).sendKeys("C://username//excel.xlsx");
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();

//java script alerts
	}
	
	
	
	
     public static void openBrowser() {
    	 
    	 HomePage.login("", "");
    	 
    	 
    	 
    	 
    System.out.println(config.getProperty("Browser"));	 
	System.out.println("openChrome Browser");
	System.setProperty("webdriver.chrome.driver","C:\\selenium notes\\chrome\\chromedriver.exe"); 
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.manage().getCookies());
    	//driver.manage().getCookies();
    	driver.manage().deleteAllCookies();
    	
    	System.out.println(driver.manage().getCookies());

    	//driver.manage().getCookieNamed("sessionID");
	
}
     public static void navigateBrowser() {
    	 System.out.println("navigatingBrowser");
    	 driver.get(config.getProperty("URL"));
    	 assertEquals(driver.getTitle(),"aajubaaju");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
     public static void registerAccount() {
    	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
    	 driver.findElement(By.xpath("//a[text()='Register']")).click();
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vijaya");
    	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Aashritha1");
    	 driver.findElement(By.xpath("//*[@name='confirmpassword']")).sendKeys("Aashritha1");
    	 driver.findElement(By.xpath("//*[@name='contact_number']")).sendKeys("6785919866");
    	driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys("karnevijaya@gmail.com");
    	driver.findElement(By.xpath("//*[@type='checkbox']")).click();
    	driver.findElement(By.xpath("//*[@class='btn btn-warning contact_subbtn']")).click();
    	
    	 
     }
     public static void loginAccount() throws Exception {
    	 System.out.println("Login Account");
    	 Thread.sleep(1000);
    	driver.findElement(By.xpath("//a[text()='Login']")).click(); 
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vijaya");
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aashritha@1");
    	driver.findElement(By.xpath("//button[@class='btn btn-warning contact_subbtn']")).click();
     }
     public static void closeBrowser() {
    	 driver.quit();
     }
     public static void search() {
    	 waitElement(driver.findElement(By.xpath("//span[text()='Category']")));
    	 driver.findElement(By.xpath("//span[text()='Category']")).click();
    	 WebElement search=driver.findElement(By.xpath("//*[@class='css-1hwfws3']"));
    waitElement(search);
    	 driver.findElement(By.xpath("//*[@class='css-1hwfws3']")).sendKeys("Electronics");
    	 
     }
     public static void waitElement(WebElement e) {
    	WebDriverWait wait=new WebDriverWait(driver,10);
    	wait.until(ExpectedConditions.elementToBeClickable(e));
     }
     public static void screenShot() throws Exception {
    	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	 //FileUtils.copyFile(src,new File("C:/Users/karne/Desktop/ScreenShots"));
    	 FileUtils.copyFile(src, new File("C:/Users/karne/Desktop/ScreenShots/Sample.png"));
    	      }
     
     
     public static void switchTowindow(String windowName) throws Exception {
    	 System.out.println("Current window "+driver.getWindowHandle());
    	 Set<String> allWindows =driver.getWindowHandles();
    	 for(String window:allWindows) {
    		 driver.switchTo().window(window);
    		 if(driver.getTitle().equals(windowName))
    			 break;
    	 }}
    	 
         public static void  clickOnTextLInk(String linkName) {

        	 List<WebElement> allWebElements=driver.findElements(By.tagName("a"));
        	 for(WebElement e: allWebElements) {
        		 if(e.getText().equals(linkName)) {
        			 e.click();
        			 break;
        		 }
         }
         }  	 
    	 
     
     }
         
