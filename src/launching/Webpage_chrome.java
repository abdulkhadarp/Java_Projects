package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Webpage_chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\Automation Testing\\web drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/your-account");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    driver.manage().window().minimize();
	    Thread.sleep(5000);
	    
	    driver.close();
	    
	}

}
