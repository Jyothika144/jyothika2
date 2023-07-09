package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class POM {

	
	WebDriver driver;
	
	By search= By.name("q");
	By storage =By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[9]/div[2]/div/div[3]/div/label/div[1]");
	By image =By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");

	
	public POM(WebDriver driver)
	{
        this.driver =driver;
	}

public void add_cart(String products)
  {
	  driver.findElement(By.name("q")).sendKeys("iphone");
	  driver.findElement(By.className("q")).sendKeys(Keys.ENTER);
	  
	  driver.findElement(storage).click();
	  driver.findElement(image).click();
  }

}

}
