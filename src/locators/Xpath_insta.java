package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
public class Xpath_insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "D:\\Automation Testing\\web drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.onlinesbi.sbi/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='login-new']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='New User ? Register here/Activate ']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.)
		
		
	}

}
