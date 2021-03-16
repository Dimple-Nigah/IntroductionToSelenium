import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
					
			//Setting key and value in property
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Tech\\Desktop\\sel\\IEDriverServer.exe");
			
			//Creating object for chromeDriver which is in interface webDriver
			WebDriver driver = new InternetExplorerDriver();
			
			//Giving the URL address which Web-page you want to access
			driver.get("https://facebook.com");
			
			//Printing the title of the Web Page
			System.out.println(driver.getTitle());
			
			
		}
}
