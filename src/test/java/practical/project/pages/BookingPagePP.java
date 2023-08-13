 package practical.project.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import practical.project.common.CommonMethodPP;
import practical.project.common.GetScreenShotPP;
import practical.project.drivers.PageDriverPP;

public class BookingPagePP extends CommonMethodPP {
	
	/*
	 * PageFactory Init
	 * Locators
	 * Functions
	 */ 
	ExtentTest test;
	public BookingPagePP(ExtentTest test) {
		PageFactory.initElements(PageDriverPP.getCurrentDriver(), this);
		this.test = test;
	} 
		 @FindBys({
			 @FindBy(xpath = "//span[@class='menu-label-level-0'][contains(.,'লেখক')]")
		})
		WebElement লেখক;
		
		@FindBys ({
			@FindBy(xpath = "//h3[contains(.,'Md. Abdul Hye')]")
			
		})
		WebElement লেখকSelect;
		
		@FindBys ({
			@FindBy(xpath = "//a[contains(.,'20% ছাড়')]")
			
		})
		WebElement ClickOnDetail;
		
		@FindBys ({
			@FindBy(xpath = "//button[contains(.,'অর্ডার করুন')][2]")
			
		})
		WebElement অর্ডারকরুন;
		
		@FindBys ({
			@FindBy(xpath = "//a[contains(.,'অর্ডার সম্পন্ন করুন')]")
			
		})
		WebElement অর্ডারসম্পন্নকরুন;
		
		public void booking() throws InterruptedException, IOException {
			
			timeout(2000);
			
			try {
				if (লেখক.isDisplayed()) {
					লেখক.click();
					timeout(1000);
					JavascriptExecutor js = (JavascriptExecutor) PageDriverPP.getCurrentDriver();
					js.executeScript("window.scrollBy(0,600)");
					timeout(1000);
					লেখকSelect.click();
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>লেখক field is working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "লেখকDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "লেখকDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>লেখক is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "লেখকLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "লেখকLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(লেখক.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
			}
			
			public void SelectBook() throws InterruptedException, IOException {
				
				timeout(3000);
			try {
				if (ClickOnDetail.isDisplayed()) {
					ClickOnDetail.click();
					timeout(5000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>ClickOnDetail field is working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "ClickOnDetailDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "ClickOnDetailDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>ClickOnDetail is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "ClickOnDetailLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "ClickOnDetailLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(ClickOnDetail.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
			
			try {
				if (অর্ডারকরুন.isDisplayed()) {
					অর্ডারকরুন.click();					
					timeout(3000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>অর্ডারকরুন field is working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "অর্ডারকরুনDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "অর্ডারকরুনDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>অর্ডারকরুন is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "ClickOnDetailLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "ClickOnDetailLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(অর্ডারকরুন.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
			try {
				if (অর্ডারসম্পন্নকরুন.isDisplayed()) {
					অর্ডারসম্পন্নকরুন.click();
					timeout(7000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>অর্ডারসম্পন্নকরুন field working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "অর্ডারসম্পন্নকরুন");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "অর্ডারসম্পন্নকরুন.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>অর্ডারসম্পন্নকরুন is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "অর্ডারসম্পন্নকরুনLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "অর্ডারসম্পন্নকরুনLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(অর্ডারসম্পন্নকরুন.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			} 
			
		}
		
		
	}


