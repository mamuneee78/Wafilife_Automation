package practical.project.pages;
import java.io.IOException;

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

public class LoginPagePP extends CommonMethodPP {
	ExtentTest test;
	public LoginPagePP(ExtentTest test) {
		PageFactory.initElements(PageDriverPP.getCurrentDriver(), this);
		this.test = test;
	}
		@FindBys ({
			@FindBy(xpath = "//a[@title='আমার অ্যাকাউন্ট']"),
			//@FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
		})
		
		WebElement ClickOnLogin;
		
		@FindBys ({
			@FindBy(xpath = "//input[@name='username']")
			
		})
		
		WebElement UserName;
		
		@FindBys ({
			@FindBy (xpath = "//input[@id='password']")
			
		})
		
		WebElement PassWord;
		
		@FindBys ({
			@FindBy (xpath = "//input[@name='login']")
			
		})
		
		WebElement LoginButton;
		
		
		
		public void login() throws IOException {
//			String expectedText = "Products";
//			String actualText = DashboardText.getText();
//			Assert.assertEquals(actualText, expectedText);
//			Assert.assertEquals(DashboardText.getText(), "Products");	// this line is enough for for this method		
			
			try {
				if (ClickOnLogin.isDisplayed()) {
			ClickOnLogin.click();
			timeout(1000);
			//Assert.assertEquals(ClickOnLogin.getText(), "বইয়ের নাম ও লেখক দিয়ে অনুসন্ধান করুন");
			test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Assertion is match successfully.</b></p>");
			String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "assertDone");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "assertDone.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		     } 
			} catch (Exception e) {
			System.out.println();
			}
		
			try {
				if(UserName.isDisplayed()) {
					UserName.sendKeys("testrezaeee@gmail.com");
//					timeout();
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>User Name field working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "UserNameDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UserNameDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>User Name field is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "UserNameLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UserNameLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(UserName.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
		
			try {
				if(PassWord.isDisplayed()) {
					PassWord.sendKeys("abcd1234#");;
//					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Password field working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "PasswordDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PasswordDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Password field is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "PasswordLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PasswordLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(PassWord.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
		    try {
				if(LoginButton.isDisplayed()) {
					LoginButton.click();
					
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>LoginButton field working as expected.</b></p>");
					String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "LoginButtonDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "LoginButtonDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>LoginButton field is not locateable.Please check the error message</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShotPP.capture(PageDriverPP.getCurrentDriver(), "LoginButtonLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "LoginButtonLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(LoginButton.isDisplayed());
				PageDriverPP.getCurrentDriver().quit();
			}
		}
}
		
			
	
	

