package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFSC {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://hurl.eu/hurls/6793b43d7133fb7c95ebff712760421aeb2389f2/abf274cb03dd165abf2816504fb9625274b87e4c");
		WebElement url = driver.findElement(By.xpath("/html/body/div[3]/div/form/div[1]/div[2]/input"));
		WebElement send = driver.findElement(By.xpath("/html/body/div[3]/div/form/div[8]/div/button"));
		url.clear();
		url.sendKeys("https://ifsc.razorpay.com/CITI0000005");
		send.click();
		WebElement response =driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/dl/dd[2]/a"));
	
		
	}
}
