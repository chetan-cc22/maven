package A2gecko;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myclass {
	 public static void main(String[] args) {
	 // declaration and instantiation of objects/variables
//	 System.setProperty("webdriver.gecko.driver","C:\\Users\\CHETAN CHAUDHARI\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
//	 WebDriver driver = new FirefoxDriver();
	 // comment the above 2 lines and uncomment below 2 lines to use Chrome 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\CHETAN CHAUDHARI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	 String baseUrl = "http://demo.guru99.com/test/newtours/";
	 String expectedTitle = "Welcome: Mercury Tours";
	 String actualTitle = "";
	 // launch Fire fox and direct it to the Base URL
	 driver.get(baseUrl);
	 // get the actual value of the title
	 actualTitle = driver.getTitle();
	 /*
	 * compare the actual title of the page with the expected one and print  * the result as "Passed" or "Failed"
	 */
	 if (actualTitle.contentEquals(expectedTitle)){
	 System.out.println("Test Passed!");
	 } else {
	 System.out.println("Test Failed");
	 }
	 driver.close();
	 }

}
