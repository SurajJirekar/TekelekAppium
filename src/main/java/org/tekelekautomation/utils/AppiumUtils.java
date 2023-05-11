package org.tekelekautomation.utils;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class AppiumUtils {
	
	AppiumDriver driver;
	public AppiumUtils(AppiumDriver driver) {
		
		this.driver = driver;
	}
	

	public void waitForElementToAppear(WebElement ele, AppiumDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.attributeContains((ele), "text", "Sign In"));

	}

	/*
	 * public List<HashMap<String, String>> getJasonData(String jasonFilePath)
	 * throws IOException { // convert jason file into jason string/// ////
	 * System.getProperty("user.dir")+
	 * "\\src\\test\\java\\org\\tekelekautomation\\testData\\tekelek.jason"
	 * 
	 * String jsonContent = FileUtils.readFileToString(new File(jasonFilePath),
	 * StandardCharsets.UTF_8);
	 * 
	 * ObjectMapper mapper = new ObjectMapper();
	 * //mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	 * mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
	 * 
	 * List<HashMap<String, String>> data = mapper.readValue(jsonContent, new
	 * TypeReference<List<HashMap<String, String>>>() {
	 * 
	 * }); return data; }
	 */
}
