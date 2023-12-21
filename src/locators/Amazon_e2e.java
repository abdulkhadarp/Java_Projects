package locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_e2e {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","D:\\Automation Testing\\web drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		//Thread.sleep(3000);
		
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 11R 5G");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Sonic Black, 8GB RAM, 128GB Storage)']")).click();
	    Thread.sleep(2000);
	    
	    ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(tab.get(1));
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
	    Thread.sleep(2000);
	    
	    //driver.findElement(By.linkText("Go to Cart")).click();
	    //driver.findElement(By.xpath("//body/div[8]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/span[1]/span[1]/input[1]")).click();
	}
	

}
