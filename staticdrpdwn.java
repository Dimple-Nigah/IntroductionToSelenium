import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Setting system variables
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		//Creating a variable for chrome driver
		WebDriver dr = new ChromeDriver();
		
		//Giving Navigation for the desired Webpage
		dr.get("https://www.spicejet.com");
		
		//Creating a variable for webelement which we will be getting from Select Tag
		WebElement staticdropdown = dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		//Creating a variable for select tag
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(4);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Thread.sleep(1000);
		
		//Selecting the option by visibleText
		dropdown.selectByVisibleText("GBP");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Selecting by Value
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		
	}

}
