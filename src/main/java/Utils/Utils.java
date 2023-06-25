package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	
	public void waitForElementToApper(WebDriver driver, long seconds) 
	{
		new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}

}
