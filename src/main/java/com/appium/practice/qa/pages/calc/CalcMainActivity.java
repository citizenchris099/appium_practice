package com.appium.practice.qa.pages.calc;

import java.util.HashMap;
import java.util.Map;

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
	private By result = By.className("android.widget.EditText");

	private HashMap<String, By> hmap = new HashMap<String, By>(15);

	/**
	 * constructor that uses shared isloaded service to check for two unique
	 * elements. 
	 * additionally it populates the hmap w/the locators needed to automate the calculator
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public CalcMainActivity(WebDriver driver) throws InterruptedException {
		super(driver);
		hmap.put("0", By.id("digit0"));
		hmap.put("1", By.id("digit1"));
		hmap.put("2", By.id("digit2"));
		hmap.put("3", By.id("digit3"));
		hmap.put("4", By.id("digit4"));
		hmap.put("5", By.id("digit5"));
		hmap.put("6", By.id("digit6"));
		hmap.put("7", By.id("digit7"));
		hmap.put("8", By.id("digit8"));
		hmap.put("9", By.id("digit9"));
		hmap.put("+", By.id("plus"));
		hmap.put("-", By.id("minus"));
		hmap.put("x", By.id("mul"));
		hmap.put("%", By.id("div"));
		hmap.put("=", By.id("equal"));
		isLoaded(hmap.get("x"), hmap.get("4"));
	}

	/**
	 * elements
	 */

	private CalcMainActivity clickButton(By button) {
		_driver.findElement(button).click();
		return this;
	}

	private String result() {
		return _driver.findElement(result).getText();
	}

	/**
	 * services
	 */

	/**
	 * used to automate the android calculator app.
	 * 
	 * @param useCalc
	 *            : array should consist of numerical strings 0-9 and strings to
	 *            denote the function of the calculator +, -, %, X and =
	 * @return
	 */
	public String useCalculator(String[] useCalc) {

		for (String b : useCalc) {
			clickButton(hmap.get(b));
		}
		return result();
	}
}