package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsPresentOrNot extends BrowserSetUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserSetUp Data=new BrowserSetUp();
		Data.SetUp("Chrome", "https:\\qa.workmarket.com");
        driver.manage().window().maximize();
		
		

	}

}
