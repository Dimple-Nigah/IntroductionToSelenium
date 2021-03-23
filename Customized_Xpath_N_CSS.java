import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Creating customized Xpaths and CssSelectors on facebookPage

public class Customized_Xpath_N_CSS {

	public static void main(String[] args)
	{
		
		//Setting Properties for environment values
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//Creating variable for chromeDriver
		WebDriver dr = new ChromeDriver();
		
		//Calling the required webPage
		dr.get("http://facebook.com");
		
		//Customised Xpaths
		/*dr.findElement(By.xpath("//*[@name = 'email']")).sendKeys("Hello");
		dr.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("123456");
		dr.findElement(By.xpath("//button[@name = 'login']")).click();	
		*/
		
		
		//Customized cssSelectors
		dr.findElement(By.cssSelector("input[name = 'email']")).sendKeys("Hello");
		dr.findElement(By.cssSelector("input[id = 'pass']")).sendKeys("123456");
		dr.findElement(By.cssSelector("button[name = 'login']")).click();	
			
		
	}

}
