package pit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tryme1 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mezof\\eclipse-workspace\\AutomationTrainingProgram\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://facebook.com");
	    driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.navigate().refresh();
		String ur=driver.getCurrentUrl();
		System.out.println(ur);
		String WindowHandle=driver.getWindowHandle();
		System.out.println(WindowHandle);
	

	}

}
