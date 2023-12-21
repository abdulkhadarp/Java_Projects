package switching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.*;


public class Switching_Tab_Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "D:\\Automation Testing\\web drivers\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();                //Maximizing the Window.
		
		driver.get("https://www.facebook.com/login.php");  //Launching URL in existing Tab. 
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.TAB);     //Switching to the new Tab.
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");          //Launching new URL in new Tab.
		Thread.sleep(5000);
		
		driver.switchTo().newWindow(WindowType.WINDOW); //Switching to new Window.
		Thread.sleep(5000);
		
		driver.get("https://www.flipkart.com/account/login");          //Launching new URL in new Window.
		Thread.sleep(5000);
		
		driver.close();                            //Closing the Window.
		
	}

}
