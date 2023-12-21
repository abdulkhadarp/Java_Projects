package navigating;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;


public class Navigating_edge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "D:\\\\Automation Testing\\\\web drivers\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/account/login");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.navigate().to("https://Amazon.in");
		Thread.sleep(5000);
        
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.close();
			

	}

}
