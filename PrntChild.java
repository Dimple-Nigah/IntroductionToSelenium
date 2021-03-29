import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrntChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting system variables
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		//Creating variable for chrome driver
		WebDriver dr = new ChromeDriver();
		
		//Calling the driver to navigate to the required webpage
		dr.get("https://en.wikipedia.org/wiki/Main_Page");
		
		//Moving from child1 node to child2 node using following-sibling function
		dr.findElement(By.xpath("//*[@id='ca-nstab-main']/following-sibling::li[1]")).click();
		
		//Now moving the control back to the parent
		dr.findElement(By.xpath("//*[@id='ca-nstab-main']/parent::ul")).click();
		
	}

}
