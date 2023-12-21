package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Locators_Boots {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "D:\\Automation Testing\\web drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.boots.com");
        Thread.sleep(3000);
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[text()='Log in/register']")).click();
       
        //By register= RelativeLocator.with(By.tagName("input")).below(By.xpath("//p[text()='Register for a Boots account to enjoy:']"));
        //driver.findElement(register).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        
        
        //By prefix = RelativeLocator.with(By.tagName("select")).rightOf(By.xpath("h1[text()='create your account here']"));
        //driver.findElement(prefix).sendKeys("Mr");
        
        Select prefix = new Select(driver.findElement(By.xpath("//select[@id='gigya-dropdown-38386608118341500']")));
        prefix.selectByIndex(3);
        
        //By prefix = RelativeLocator.with(By.xpath("//*[@value='Mr']")).above(By.name()));
        //driver.findElement(prefix).sendKeys("Mr");

        driver.findElement(By.xpath("//input[@data-display-name='First name']")).sendKeys("Abdul");
        
	}

}
