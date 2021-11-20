import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\osman.esen\\Documents\\chromedriver.exe");
		

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.com.tr/");	
	    System.out.println(driver1.getTitle());
	    System.out.println(driver1.getCurrentUrl());
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\osman.esen\\Documents\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.amazon.com.tr/");	
	    System.out.println(driver2.getTitle());
	    System.out.println(driver2.getCurrentUrl());
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\osman.esen\\Documents\\msedgedriver.exe");
		
		WebDriver driver3 = new EdgeDriver();
		
		driver3.get("https://www.amazon.com.tr/");	
	    System.out.println(driver3.getTitle());
	    System.out.println(driver3.getCurrentUrl());
	    //driver.close();
	    
	}

}
