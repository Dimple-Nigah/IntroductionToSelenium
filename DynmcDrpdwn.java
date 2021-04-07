import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* Code for handling Dynamic DropDowns*/

public class DynmcDrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setting system variables
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//Creating variable for webdriver		
		WebDriver dr = new ChromeDriver();
		
		//Navigating to the desired webpage
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Clicking on the Departure City option from the Dynamic 
		dr.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//Click on the 'Bengaluru' City from the dropdown
		dr.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(2000);
		
		//Click on the 'Chennai' city from arrival's dropdown
		dr.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		
	}

}
