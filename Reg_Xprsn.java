import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Creating Xpaths and CSSSelectors with the help of Regular Expressions
//Syntax, //tagname[contains(@Attribute,'value')] ======> Xpath Regular Expression
//Syntax, tagname[attribute*='value']

public class Reg_Xprsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting Properties for environment values
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
		//Creating variable for chromeDriver
		WebDriver dr = new ChromeDriver();
				
		//Calling the required webPage
		dr.get("http://rediff.com");
		dr.findElement(By.cssSelector("a[title*='Sign in']")).click();					//xpath
		dr.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");			//CSS
		dr.findElement(By.cssSelector("input#password")).sendKeys("123456789");			//Xpath
		dr.findElement(By.xpath("//input[contains(@name,'procee')]")).click();			//CSS
		
		
		//Closing the browser
		//dr.close();
				
	}

}
