package practical.project.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import practical.project.common.CommonMethodPP;
import practical.project.common.GetScreenShotPP;
import practical.project.drivers.PageDriverPP;

public class OrderInfoPagePP extends CommonMethodPP {

	ExtentTest test;

	public OrderInfoPagePP(ExtentTest test) {
		PageFactory.initElements(PageDriverPP.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBys({ @FindBy(xpath = "//select[@name='billing_area'][contains(@id,'area')]") })
	WebElement billingArea;

//		@FindBys ({
//			@FindBy(xpath = "//textarea[contains(@spellcheck,'false')]")
//			
//		})
//		WebElement ঠিকানা;
//
//		@FindBys ({
//			@FindBy(xpath = "//textarea[@name='order_comments']")
//			
//		})
//		WebElement অন্যান্যতথ্য;
		

//		@FindBys ({
//			@FindBy(xpath = "//input[@value='cod']")
//			
//		})
//		WebElement paymentgateway;

//	@FindBys({ @FindBy(xpath = "//button[contains(.,'অর্ডার সম্পন্ন করুন')]")
//
//	})
//	WebElement সম্পন্নকরুন;
	
	@FindBys({ @FindBy(xpath = "(//a[contains(@title,'আমার অ্যাকাউন্ট')])[2]")

	})
	WebElement GotoAccount;
	
	@FindBys({ @FindBy(xpath = "//a[contains(.,'লগআউট')]")

	})
	WebElement logout;

	public void order() throws InterruptedException, IOException {
		try {
			if (billingArea.isDisplayed()) {
				Select select = new Select(billingArea);
				select.selectByIndex(5);
				timeout(1000);
//				ঠিকানা.sendKeys("Test Address");
//				অন্যান্যতথ্য.sendKeys("Nothing to say");
//				timeout(1000);
//				JavascriptExecutor js = (JavascriptExecutor) PageDriverPP.getCurrentDriver();
//				js.executeScript("window.scrollBy(0,400)");
//				timeout(1000);
				
				test.pass(
						"<p style=\"color:#85BC63; font-size:13px\"><b>billingArea field is working as expected.</b></p>");
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "billingArea");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "billingArea.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>billingArea is not locateable.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "billingAreaLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "billingAreaLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(billingArea.isDisplayed());
			PageDriverPP.getCurrentDriver().quit();
		}

		try {
			if (GotoAccount.isDisplayed()) {
				GotoAccount.click();
				timeout(2000);
				logout.click();
				timeout(7000);
				test.pass(
						"<p style=\"color:#85BC63; font-size:13px\"><b>GotoAccount field is working as expected.</b></p>");
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "GotoAccount");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "GotoAccount.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>GotoAccount is not locateable.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "GotoAccountLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "GotoAccountLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(GotoAccount.isDisplayed());
			PageDriverPP.getCurrentDriver().quit();
		}

//			try {
//				if (passWord.isDisplayed()) {
//					//passWord.sendKeys("admin123");
//					passWord.sendKeys("secret_sauce");
//					timeout(2000);
//					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Password field working as expected.</b></p>");
//					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "PassDone");
//					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PassDone.png";
//					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				}
//			} catch (Exception e) {
//				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Password is not locateable.Please check the error message.</b></p>");
//				Throwable t = new InterruptedException("Exception");
//				test.fail(t);
//				@SuppressWarnings("unused")
//				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "passwordLocator");
//				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "passwordLocator.png";
//				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				Assert.assertTrue(userName.isDisplayed());
//				PageDriverPP.getCurrentDriver().quit();
//			} 

	}

}
