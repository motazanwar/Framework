package pit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class broweser {
	WebDriver driver;
	
  @Test
  public void f() {
	  WebElement emailType= driver.findElement(By.name("email"));
	  emailType.sendKeys("mikeanwar79@gmail.com");
	  
	  WebElement word= driver.findElement(By.name("pass"));
	  word.sendKeys("Simsim@85");
	  
	  WebElement log= driver.findElement(By.name("login"));
	  log.click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mezof\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
		  }

		
	}


