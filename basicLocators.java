import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Setting the key and value in environmental variable
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//Creating object for webDriver
		WebDriver driver = new ChromeDriver();
		
		//Navigate the URL
		driver.get("https://facebook.com");
		
		//Locating with the 'ID' Attribute
		driver.findElement(By.id("email")).sendKeys("FirstCode");
		
		//Locating with the 'Name' Attribute
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		//Locating with the 'LinkText' Attribute
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		//Close the browser
		driver.close();
		

	}

}
