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
				WebElement staticdropdownAdult = dr.findElement(By.id("ctl00_mainContent_ddl_Adult"));
				
				//Creating a variable for select tag
				Select dropdownAdult = new Select(staticdropdownAdult);
				dropdownAdult.selectByValue("3");//Adding 3 adults
				System.out.println(dropdownAdult.getFirstSelectedOption().getText());

				//Add two childs in Passengers
				WebElement staticdropdownChild = dr.findElement(By.id("ctl00_mainContent_ddl_Child"));
				Select dropdownChild = new Select(staticdropdownChild);
				dropdownChild.selectByValue("2");//Adding 3 adults
				System.out.println(dropdownChild.getFirstSelectedOption().getText());
				
				
				//Add two Infants in Passengers
				WebElement staticdropdownInfants = dr.findElement(By.id("ctl00_mainContent_ddl_Infant"));
				Select dropdownInfants = new Select(staticdropdownInfants);
				dropdownInfants.selectByValue("1");//Adding 3 adults
				System.out.println(dropdownInfants.getFirstSelectedOption().getText());
				
				
				dr.findElement(By.id("divpaxinfo")).click();
				
				
				
	}

}
