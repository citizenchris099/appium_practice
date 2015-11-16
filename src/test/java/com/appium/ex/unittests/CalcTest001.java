package com.appium.ex.unittests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.appium.practice.qa.pages.calc.CalcMainActivity;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.Assert;

public class genericTest001 {

	AppiumDriver<WebElement> driver;
	String[] calc = {"2", "2" , "+", "2", "="};

	@BeforeClass
	public void setup() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "4.4");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "test");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		cap.setCapability("avd", "test");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "Calculator");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void appiumtest001() throws InterruptedException {

		Assert.assertNotNull(driver.getContext());
		System.out.println(
				"The output from the calculator = " + new CalcMainActivity(driver).useCalculator(calc));

	}

}