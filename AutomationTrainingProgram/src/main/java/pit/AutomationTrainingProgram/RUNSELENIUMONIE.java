package pit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class RUNSELENIUMONIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver" ,"C:\\Users\\mezof\\Downloads\\Compressed\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https//google.com");
		

	}

}
