import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Updatedrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Setting system variables
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				//Creating a variable for chrome driver
				WebDriver dr = new ChromeDriver();
				
				//Giving Navigation for the desired Webpage
				dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
				//Click the desired item
				dr.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				
				int i=1;
				while(i<5)
				{
					
					//Clicking on Adult button to increase the no. of ppl
					dr.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				//Clicking on the done button at the end
				dr.findElement(By.id("btnclosepaxoption")).click();
				
				System.out.println(dr.findElement(By.id("divpaxinfo")).getText());
				
				
				
	}

}
