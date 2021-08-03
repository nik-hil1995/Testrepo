package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown extends BrowserSetUp{
    static WebElement Drop;
  
	public static void main(String[] args) {
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select select=new Select(Drop= driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
        select.selectByValue("Bermuda");
	}

}
