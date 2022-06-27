package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoTest extends Base{
	
	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.jotform.com/form-templates/auto-loan-application-form");
		
		driver.findElement(By.id("input_8_addr_line1")).sendKeys("gaglul");
	}
}
