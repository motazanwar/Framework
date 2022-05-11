package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mezof\\\\eclipse-workspace\\\\AutomationTrainingProgram\\\\Driver\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get().to("https://google.com");
	}

}
