package pit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChromeBrowserDriver {
	//calling the web-driver as a global variable webdriver org.openqa.selenium
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		
		//setup chrome broweser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mezof\\eclipse-workspace\\AutomationTrainingProgram\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.navigate().refresh();
		String ur=driver.getCurrentUrl();
		System.out.println(ur);
		String WindowHandle=driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.close();
	
		
		
	}

}
