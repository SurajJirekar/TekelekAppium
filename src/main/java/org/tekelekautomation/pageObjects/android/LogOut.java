package org.tekelekautomation.pageObjects.android;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class LogOut {
	
	AndroidDriver driver;	
	
	
	/* @AndroidFindBy(id="") */
	
	public LogOut(AndroidDriver driver) {
	this.driver = driver;
	PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void clickLogOut() {
		
	}
	

}
