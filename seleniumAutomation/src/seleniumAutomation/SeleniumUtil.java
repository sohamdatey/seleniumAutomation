package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtil {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	SeleniumUtil(String driverName,String driverLocation)
	{   System.setProperty(driverName, driverLocation);
		this.driver=new ChromeDriver();
		
	}
	
	public void openUrl(String url)
	{	
		driver.get(url);
		
	}
	
	public boolean readTest(String xpath,String expectedOutput) {
		 
		  WebElement fName=driver.findElement(By.xpath(xpath));
		  //fName.sendKeys("Admin");
		 
		  return fName.getText().equalsIgnoreCase(expectedOutput);
		 
	}
	
	
}
