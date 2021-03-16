import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Setting key and value in property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//Creating object for chromeDriver which is in interface webDriver
		WebDriver driver = new ChromeDriver();
		
		//Giving the URL address which Web-page you want to access
		driver.get("https://google.com");
		
		//Printing the title of the Web Page
		System.out.println(driver.getTitle());
		
		
	}

}
