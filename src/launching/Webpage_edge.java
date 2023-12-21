package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class Webpage_edge {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "D:\\Automation Testing\\web drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in/your-account"); // Launching the page
		Thread.sleep(1000);

		System.out.println(driver.getTitle()); // Printing the title of the page

		driver.manage().window().maximize(); // Maximizing the window
		Thread.sleep(5000);

		driver.manage().window().minimize(); // Minimizing the window
		Thread.sleep(5000);

		driver.close(); // to close the window

	}

}
