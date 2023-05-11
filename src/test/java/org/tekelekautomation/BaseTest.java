package org.tekelekautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.tekelekautomation.utils.AppiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest extends AppiumUtils{
	
	
	AppiumDriver driver;
	public BaseTest(AppiumDriver driver) {
		super(driver);
		this.driver= driver;
	}

	
	@BeforeMethod
	public void preSetUp() {
		
	}
	
	
	public AppiumDriverLocalService service;
	@BeforeClass
	public void ConfigureAppium() throws URISyntaxException, MalformedURLException, ExceptionInInitializerError {
		//// Code to start Appium Server///

		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\Dell\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
				.withIPAddress("192.168.0.9").usingPort(4723).build();
		/// service.start(); ///commented as server is causing issue while opening
		
		// Appium Code -> Appium Server ->Mobile///
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel2XL");
		options.setApp("C:\\Users\\Dell\\eclipse-workspace\\TekAppium\\src\\test\\java\\resources\\Tek_28_04_23.apk");

		// Android Driver//
		URI uri = new URI("http://192.168.0.9:4723");
		URL url = uri.toURL();
		driver = new AndroidDriver(url, options);

	}

	@AfterClass
	public void tearDownn() {
		driver.quit();
		//// Stop Server///
		service.stop();
	}

}
