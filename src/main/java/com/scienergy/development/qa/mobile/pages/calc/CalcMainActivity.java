package com.scienergy.development.qa.mobile.pages.calc;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.scienergy.development.qa.mobile.pages.Page;

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
	 * elements. additionally it populates the hmap w/the locators needed to
	 * automate the calculator I noticed a pattern with the id naming of the
	 * buttons in the anroid calc app 'digit0' and so on
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */
	public CalcMainActivity(WebDriver driver) throws InterruptedException {
		super(driver);
		for (int i = 0; i < 10; i++) {
			hmap.put(Integer.toString(i), By.id("digit" + Integer.toString(i)));
		}
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

	/**
	 * used to click the various buttons on the calculator
	 * 
	 * @param button
	 *            : By
	 * @return
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