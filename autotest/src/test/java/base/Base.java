package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.xdevapi.Statement;

public class Base {
	protected static WebDriver driver;
	public static Statement stmt;
	
	
	public static void click(By by) {
		driver.findElement( by ).click();
	}
	
	public static void sendKeys(By by, String value) {
		driver.findElement( by ).sendKeys( value );
	}
	
	public static boolean isDisplayed(By by){
		//WebElement element = driver.findElement( by );
		return driver.findElement( by ).isDisplayed();
	}
	
	public static boolean isEnabled(By by){
		//WebElement element = driver.findElement( by );
		return driver.findElement( by ).isEnabled();
	}
	
	public static String getText(By by){
		return driver.findElement(by).getText();
	}
}
