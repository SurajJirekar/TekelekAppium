package org.tekelekautomation;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.Duration;
import org.tekelekautomation.pageObjects.android.SettingsUiPathPage;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics extends BaseTest {

	/*
	 * @BeforeMethod public void preSetUp() {
	 * 
	 * //set your screen to home page//
	 * 
	 * 
	 * }
	 */
	AndroidDriver driver;
	public AppiumBasics(AndroidDriver driver) {
		super(driver);
		this.driver= driver;
		// TODO Auto-generated constructor stub
	}

	@Test 
	public void AppiumTestLogIn() throws IOException, URISyntaxException, InterruptedException {

		/// Actual Code///
		SettingsUiPathPage settingsPage = new SettingsUiPathPage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		settingsPage.enterPassword("Tek2qt36A*");

		settingsPage.clickLogIn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	

}
