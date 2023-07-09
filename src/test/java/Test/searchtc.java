package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.POM;

public class searchtc {

	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	@Test
	public void fliptest() {
		POM ob= new POM(driver);
		ob.add_cart("iphone");
	}
}



