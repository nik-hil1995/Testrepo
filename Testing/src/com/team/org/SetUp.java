package com.team.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SetUp {
    static WebDriver driver;

    public void selectdropdown(WebElement element) {
	Select select = new Select(element);
    }

    public WebElement selectByXpath(String value) {
	return driver.findElement(By.xpath("value"));

    }

    public void selectByCSS(String value) {
	driver.findElement(By.cssSelector("value"));

    }

    public void selectByClassName(String Class) {

    }

    public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\thinksysuser\\git\\Testrepo\\Testing\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
    }

}
