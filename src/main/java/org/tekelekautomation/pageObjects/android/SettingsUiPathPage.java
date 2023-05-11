package org.tekelekautomation.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingsUiPathPage {
	
	
	AndroidDriver driver;	
	
	public SettingsUiPathPage(AndroidDriver driver) {
		try {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	
	} catch (Exception e) {

        e.printStackTrace();
    }
	}
	
	///Locators
	@AndroidFindBy(id="com.tek889:id/edtPassword")
	private WebElement password;
	
	@AndroidFindBy(id="com.tek889:id/btnLogin")
	private WebElement loginButton;
	
	
	///Action Methods
	public void enterPassword(String data) {
		password.sendKeys(data);
	}
	
	public void clickLogIn() {
		loginButton.click();
	}
	
		
	
}
