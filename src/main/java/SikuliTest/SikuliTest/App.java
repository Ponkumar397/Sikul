package SikuliTest.SikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class App 
{
    public static void main( String[] args ) 
    {
    	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/search?q=todays+news&oq=todays+news&aqs=chrome..69i57j0i10i131i433j0i433j"
				+ "0l3j0i10i131i433j0l2j0i10.8818j0j15&sourceid=chrome&ie=UTF-8");
    	Screen s=new Screen();
    	Pattern first=new Pattern("C:\\Images\\News1.PNG");
    	try {
			s.wait(first,20000);
			s.click("C:\\Images\\News1.PNG");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
      
    	
    }
}
