package practical.project.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverPP {
	//public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url = "https://www.wafilife.com/";
		WebDriver driver = null;
		
		@BeforeTest
		public void start() {
		
			String browser = System.getProperty("browser", "firefox");
			
			if(browser.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browser.contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			PageDriverPP.getInstance().setDriver(driver);
		}
	
			@AfterTest
			public void close() {
			PageDriverPP.getCurrentDriver().quit();
	}
		
	
	
}
	
	


