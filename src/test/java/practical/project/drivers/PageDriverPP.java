package practical.project.drivers;

import org.openqa.selenium.WebDriver;

public class PageDriverPP {
    
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static PageDriverPP instance = null;
	
	private PageDriverPP() {
		
	}
	
	public static PageDriverPP getInstance() {
		if(instance == null) {
			instance = new PageDriverPP();
		}
		return instance;
	}
	
	public WebDriver getDriver() {
		return webDriver.get();
	}
	
	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}
	
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
}