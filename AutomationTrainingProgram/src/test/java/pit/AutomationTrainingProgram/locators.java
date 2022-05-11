package pit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	
	static WebDriver driver;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mezof\\eclipse-workspace\\AutomationTrainingProgram\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement searchfieldtxt= driver.findElement(By.name("field-keywords"));
		searchfieldtxt.sendKeys("computer");
		WebElement searchicon=driver.findElement(By.id("nav-search-submit-button"));
		searchicon.click();
	WebElement linktx=	driver.findElement(By.linkText("Registry"));
	linktx.click();
		driver.findElement(By.linkText(null));
				
		

	}

}
