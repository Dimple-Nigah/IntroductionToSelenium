import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting key and value for environment variables
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//Creating object for WebDriver
		WebDriver driver = new ChromeDriver();
		
		//Driver is created and now you can give the URL where you want to get navigate
		driver.get("https://www.google.com");
		
		//Validating the current URL
		System.out.println(driver.getCurrentUrl());
		
		//Getting the whole PageSource
		//System.out.println(driver.getPageSource());
		
		//Navigating onto the another WebPage and then Moving Backward and Forward Methods.
		driver.get("https:\\www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		//Closing the current browser at the end
		driver.close();
		
		//Closing all the browsers opened
		//driver.quit();
			
	
	}

}
