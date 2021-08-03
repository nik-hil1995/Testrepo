package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AcceptAlert extends BrowserSetUp {

   
	public static void main(String args[]) {
        BrowserSetUp data=new BrowserSetUp();
	    data.SetUp("Chrome","https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
	    System.out.print("You selected OK!");
	}
	
	
}
