package com.team.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

public class HandlingDropdown {
    static SetUp Set;
    WebDriver driver;

    public void Handle() {
	driver.get("https://www.goibibo.com/");
	Set = new SetUp();
	Set.selectByXpath("//input[@id='gosuggest_inputSrc']").sendKeys("Delhi");

	java.util.List<WebElement> dropdownValue = driver
		.findElements(By.xpath("//div[@class='widget-autosuggeststyles__SuggstEleHd-sc-ltoyne-9 cNRGeo']"));
	for (int i = 0; i < dropdownValue.size(); i++) {
	    WebElement ele2 = dropdownValue.get(i);
	    String value = ele2.getAttribute("innerHTML");
	    if (value.equalsIgnoreCase("Delhi")) {
		ele2.click();
	    }
	}
    }
}
