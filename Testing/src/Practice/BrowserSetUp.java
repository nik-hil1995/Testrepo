package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {
	static WebDriver driver;
	public void SetUp(String str1, String URL) {
		  switch (str1) {
		  case "Chrome":
		       System.setProperty("webdriver.chrome.driver", "C:\\Users\\thinksysuser\\Downloads\\chromedriver\\chromedriver.exe");
		       driver=new ChromeDriver();
		       driver.get(URL);
	      break;
		  case "FireFox":
	          System.setProperty("webdriver.gecko.driver", "C:\\Users\\thinksysuser\\Thinksys\\Testing\\Drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get("URL");	  
		      break;
		  default:
			  System.out.println("Please select browser!!");
		     	  
		      
	 }
		
	}
	
	
	
	}
