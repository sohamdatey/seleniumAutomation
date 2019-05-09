package seleniumAutomation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClient {

	
	public static void main(String [] args) throws InterruptedException{
	       
        SeleniumUtil su= new SeleniumUtil("webdriver.chrome.driver" ,"O:/codingSoftwares/chromedriver_win32/chromedriver.exe");
        su.openUrl("https://angular.io/");
        if(su.readTest("//*[@id='intro']/div[2]/a", "GET STARTED")) {
        	System.out.println("true");
        }
 }
}
