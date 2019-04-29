package BandLab.TestUserShout.BaseFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Locale;
public class BaseMethods {

	public static WebDriver driver;
	private WebDriverWait wait;
	private static final int TIMEOUT = 60;
    private static final int POLLING  = 100;

	public WebDriver startChromeDriver()
	{ 
		if (driver == null || ((ChromeDriver)driver).getSessionId() == null)
		{
			String operatingSystem = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
			if(operatingSystem.contains("window")){
				System.setProperty("webdriver.chrome.driver","ChromeDriverWindows/chromedriver.exe");
			}
			else if(operatingSystem.contains("linux")){
				System.setProperty("webdriver.chrome.driver","ChromeDriverLinux/chromedriver");
			}
			else if(operatingSystem.contains("mac")){
				System.setProperty("webdriver.chrome.driver","ChromeDriverMac/chromedriver");
			}
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("incognito");
			chromeOptions.addArguments("allow-file-access-from-files"); 
			chromeOptions.addArguments("use-fake-device-for-media-stream"); 
			chromeOptions.addArguments("use-fake-ui-for-media-stream"); 
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		}else {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void tearDown() throws Exception 
	{
		driver.close();
		driver.quit();
		driver = null;
	}

	public WebElement waitForElementToAppear(By xPath) {
		 wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(xPath));
	}
	
	public void waitForElementToBeAppear(By xPath) {
		 wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xPath));
	}

	public void waitForElementToBeClickable(By xPath){
		 wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		wait.until(ExpectedConditions.elementToBeClickable(xPath));
	}

	public void staticWait(){
		try { 
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
