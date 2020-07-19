package Base;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverInit {

	public static void main(String[] args) throws InterruptedException {
	
		    System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Dimension d = new Dimension(480,500);
	        driver.manage().window().maximize();
	        driver.get("https://www.godaddy.com/");
	        driver.manage().window().setSize(d);
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println("Title of the page: " +title);
            System.out.println("Current url: " + driver.getCurrentUrl());
            String ps = driver.getPageSource();

            
            /*System.out.println("Current pagesource: " + ps);
            Boolean b = ps.contains(title);
            System.out.println(b);*/
            
           
            String expectedtitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
            if(title.equalsIgnoreCase(expectedtitle))
            {
            	System.out.println("Title is matched");
            } else
            {
            	System.out.println("Title is not matched");
            }
            
            
            driver.close();
	        
	}

}
