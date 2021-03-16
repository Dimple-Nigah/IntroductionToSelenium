import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Setting key and value in property
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tech\\Desktop\\sel\\geckodriver.exe");
		
		//Creating object for chromeDriver which is in interface webDriver
		WebDriver driver = new FirefoxDriver();
		
		//Giving the URL address which Web-page you want to access
		driver.get("https://facebook.com");
		
		//Printing the title of the Web Page
		System.out.println(driver.getTitle());
		
		
	}

}
