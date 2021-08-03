package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
     
    static WebDriver driver;
	        public static void main(String[] args) throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\thinksysuser\\Thinksys\\Testing\\Drivers\\chromedriver.exe");
	    	driver = new ChromeDriver();		
	    	driver.get("https://qa.workmarket.com/talent");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.findElement(By.id("login-email")).sendKeys("qa+t@workmarket.com");
		    driver.findElement(By.id("login-password")).sendKeys("w0rkmarket12");
		    driver.findElement(By.id("login_page_button")).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//button[@aria-label=\"Settings\"]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),\"Configure Columns\")]")).click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement Item1 = driver.findElement(By.xpath("//div[@class=\"jss712\"]/div[2]"));
	        WebElement Item2 =driver.findElement(By.xpath("//div[@class=\"jss712\"]/div[5]"));
	        Actions Act=new Actions(driver);
	        Act.dragAndDrop(Item1, Item2).perform();

	        	        
	        }
	
	
	
}
