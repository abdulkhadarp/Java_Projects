package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locators_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		System.setProperty("Webdriver.edge.driver","D:\\Automation Testing\\web drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
	    Thread.sleep(3000);
		
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Abdul Khadar");
		Thread.sleep(3000);
		
		By country= RelativeLocator.with(By.tagName("select")).below(By.name("customerName"));
		driver.findElement(country).sendKeys("AE +971");
		Thread.sleep(3000);
		
		driver.findElement(By.name("email")).sendKeys("9988776655");
		Thread.sleep(3000);
		
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys("abdulkkhadar123@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("Abdul@123");
		Thread.sleep(3000);
		
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(3000);
        
		
	}

}
