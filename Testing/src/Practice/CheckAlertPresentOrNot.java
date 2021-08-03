package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckAlertPresentOrNot{
	static WebDriver driver;
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\thinksysuser\\Thinksys\\Testing\\Drivers\\chromedriver.exe" );
        driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		isAlertPresent();
	}
	    public static void isAlertPresent() {
	    	try {
	    		Alert alert=driver.switchTo().alert();
	    	
	    		System.out.print(alert.getText()+"Alert is displayed");
	    		
	    	}
	    	catch(NoAlertPresentException ex) {
	    		System.out.print("Alert not displayed");
	    	}
	    	}
	    	
	 	
}


