import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Checking the verifying the accuracy of the CSSSelector and Xpath On the PageName = Salesforce*/


public class salesForcePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Setting the key and value in environmental variable
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				//Creating object for webDriver
				WebDriver driver = new ChromeDriver();
				
				//Navigate the URL
				driver.get("https://login.salesforce.com/");
				
				//Locating with the 'ID' Attribute
				driver.findElement(By.id("username")).sendKeys("FirstCode");
				
				//Locating with the 'Name' Attribute
				driver.findElement(By.name("pw")).sendKeys("12345");
				
				//Locating with the 'XPath' Attribute
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				
				//Printing the error message in console after entering incorrect username and password
				System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
				
				//Close the browser
				driver.close();
				
	}

}
