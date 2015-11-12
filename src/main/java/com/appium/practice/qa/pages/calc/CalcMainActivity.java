package com.appium.practice.qa.pages.calc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appium.practice.qa.pages.Page;

/**
 * the main activity of the calculator app
 * 
 * @author cmanning
 *
 */
public class CalcMainActivity extends Page {

	/**
	 * locators
	 */
	private By num0 = By.id("digit0");
	private By num1 = By.id("digit1");
	private By num2 = By.id("digit2");
	private By num3 = By.id("digit3");
	private By num4 = By.id("digit4");
	private By num5 = By.id("digit5");
	private By num6 = By.id("digit6");
	private By num7 = By.id("digit7");
	private By num8 = By.id("digit8");
	private By num9 = By.id("digit9");
	private By add = By.id("plus");
	private By sub = By.id("minus");
	private By mul = By.id("mul");
	private By div = By.id("div");
	private By eq = By.id("equal");
	private By result = By.className("android.widget.EditText");

	/**
	 * constructor that uses shared isloaded service to check for two unique
	 * elements
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public CalcMainActivity(WebDriver driver) throws InterruptedException {
		super(driver);
		isLoaded(num1, add);
	}

	/**
	 * elements
	 */

	private CalcMainActivity clickButton(By num) {
		_driver.findElement(num).click();
		return this;
	}
	
	private String result(){
		return _driver.findElement(result).getText();
	}

	/**
	 * services
	 */

	/**
	 * 
	 * @param useCalc
	 * @return
	 */
	public String useCalculator(By[] useCalc) {


		for (By b : useCalc) {
			clickButton(b);

		}

		return result();
	}

}