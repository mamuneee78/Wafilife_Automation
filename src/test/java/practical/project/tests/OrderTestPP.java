package practical.project.tests;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import practical.project.common.ExtentFactoryPP;
import practical.project.drivers.BaseDriverPP;
import practical.project.drivers.PageDriverPP;
import practical.project.pages.BookingPagePP;
import practical.project.pages.OrderInfoPagePP;

public class OrderTestPP extends BaseDriverPP {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() {
//		PageDriverPP.getCurrentDriver().manage().window().maximize();
//		PageDriverPP.getCurrentDriver().get(url);
		report = ExtentFactoryPP.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>WafiLife_Order</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
		
	}

	@Test
	public void OrderTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Order Test</b></p>");
		OrderInfoPagePP Ordergpage = new OrderInfoPagePP(childTest);
		Ordergpage.order();
//		JavascriptExecutor js = (JavascriptExecutor) PageDriverPP.getCurrentDriver();
//		js.executeScript("window.scrollBy(0,600)");
	}
		
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
