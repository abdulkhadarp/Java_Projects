package locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Strings;

public class Locators_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		//TC-1 Setting the properties.
		System.setProperty("Webdriver.edge.driver", "D:\\Automation Testing\\web drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
        //TC-2 Launching the FB Login Page
		driver.get("https://www.facebook.com/login/");

		
		//TC-3 Maximizing the window
		driver.manage().window().maximize();

		
		//TC-4 Launching Sign Up Page in 0th tab
		driver.findElement(By.xpath("//a[text()= 'Sign up for Facebook']")).click();

		System.out.println(driver.getTitle()); //Getting the title of the page.

		
		//TC-5 Entering the First Name
		driver.findElement(By.name("firstname")).sendKeys("Abdul Khadar");
		Thread.sleep(2000);

		
		//TC-6 Entering the Last Name
		driver.findElement(By.name("lastname")).sendKeys("Pathaan");
		Thread.sleep(2000);

		
		//TC-7 Entering the mobile number.
		driver.findElement(By.name("reg_email__")).sendKeys("9988776655");
		Thread.sleep(2000);

		// driver.findElement(By.id("password_step_input")).sendKeys("akp@123"); //Using
		// normal locators
		// Thread.sleep(3000);

		
		////TC-8 Entering the password Using RL "Above"
		By password = RelativeLocator.with(By.tagName("input")).above(By.id("day")); // 
		driver.findElement(password).sendKeys("akp@123");
		Thread.sleep(2000);

		
		
        ////TC-9 Selecting the Day using RL "Left of"
		By dob = RelativeLocator.with(By.tagName("select")).toLeftOf(By.id("month")); 																				// Day
		driver.findElement(dob).sendKeys("10");
		Thread.sleep(2000);
		
        // Select day = new Select(driver.findElement(By.name("birthday_day")));
		// day.selectByValue("10");
		// Thread.sleep(3000);

		//TC-10 Selecting the Month using VisibleText.
		Select month = new Select(driver.findElement(By.id("month"))); 
		month.selectByVisibleText("Aug");
		Thread.sleep(2000);

		
		//TC-11 Selecting the Year using RL "Right of"
		By yob = RelativeLocator.with(By.tagName("select")).toRightOf(By.id("month")); 
		driver.findElement(yob).sendKeys("1998");
		Thread.sleep(2000);
		
		// Select year = new Select(driver.findElement(By.name("birthday_year")));
		// year.selectByIndex(25);
		// Thread.sleep(3000);


        //TC-12 Clicking on Male radio button using RL (Below).
		By gender = RelativeLocator.with(By.tagName("input")).below(By.id("month")); 
		driver.findElement(gender).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//label[text()='Male']")).click();

		
		//TC-13 Clicking on Submit button Using RL(Near)
		By submit = RelativeLocator.with(By.tagName("button")).near(By.id("privacy-link")); 
		driver.findElement(submit).click();
		// driver.findElement(By.xpath("//button[text()= 'Sign Up']")).click();
		
		//TC-14 Clicking on Learn more using PartiallinkText
		driver.findElement(By.partialLinkText("Cookies")).click(); 
        Thread.sleep(2000);
		
        //TC-15 Getting Window handles. 
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());  
		
		//TC-16 Activating/Launching Cookies window (1st Window)
		driver.switchTo().window(tab.get(1)); 
		Thread.sleep(2000);
		
		//TC-17 Clicking on Previous versions link using link text.
		driver.findElement(By.linkText("See previous versions")).click();
		Thread.sleep(5000);
		
		//TC-18 Closing the Cookies/1st Window
		driver.close();
		
		
		//TC-19 Switching back to Sign Up window
		driver.switchTo().window(tab.get(0));
		Thread.sleep(10000);
		
		//TC-20 Closing the Sign Up/0th window
		//driver.close();
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
