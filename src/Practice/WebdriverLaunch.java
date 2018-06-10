package Practice;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.util.ArrayList;
import java.util.List;

import javax.activation.FileDataSource;
import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebdriverLaunch {
	static ArrayList<String> tabs ;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");

		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String BaseUrl = "https://www.softwaretestingmaterial.com/sample-webpage-to-automate/";
		driver.get(BaseUrl);
		//(JavascriptExecutor(driver)	).executeScript("Document")
		//driver.navigate().refresh();
		WebElement mySeelctElement = driver.findElement(By.name("dropdown"));
		Select dropdown = new Select(mySeelctElement);
		List<WebElement> options = dropdown.getOptions();
		for(WebElement option : options)
		{
			System.out.println(option.getText());
		}
		
		driver.navigate().forward();
		driver.navigate().to("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files. copy(src, new File("C:\\Users\\bangea\\Downloads/screenshot.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//String availabletext = driver.findElement(By.xpath("")).getText();
		//System.out.println("Availebe text is:" + availabletext);
		try {
			WebElement cusservice = driver.findElement(By.linkText("Amazon Pay"));
			cusservice.click();
			String title = "Amazon.in:Amazon Pay";
			driver.get(title);
			driver.close();
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Element not displayed");
		}
	}
	public static void switchToTab(WebDriver driver,int i){
		tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("new tab opened "+tabs.get(i).toString());
		driver.switchTo().window(tabs.get(i));	
	}
	public static void closeTab(WebDriver driver,int i){
		tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("tab closed "+tabs.get(i).toString());
		driver.switchTo().window(tabs.get(i)).close();	
	}
}
