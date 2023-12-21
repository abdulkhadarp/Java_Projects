package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class Ajio_e2e {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "D\\Automation Testing\\web drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Men")).click();
		
		//Select men= new Select(driver.findElement(By.xpath(null)));
		

	}

}
