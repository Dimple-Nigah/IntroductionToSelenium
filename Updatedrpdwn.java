import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Updatedrpdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setting system variables
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				//Creating a variable for chrome driver
				WebDriver dr = new ChromeDriver();
				
				//Giving Navigation for the desired Webpage
				dr.get("https://www.spicejet.com");
				
				//Click the desired item
				dr.findElement(By.id("divpaxinfo")).click();
				
				//Creating a variable for webelement which we will be getting from Select Tag
				WebElement staticdropdown = dr.findElement(By.id("ctl00_mainContent_ddl_Adult"));
				
				//Creating a variable for select tag
				Select dropdown = new Select(staticdropdown);
				dropdown.selectByValue("3");
				dr.findElement(By.id("divpaxinfo")).click();
				System.out.println(dropdown.getFirstSelectedOption().getText());

				
				
	}

}
