package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCLogin {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement email  = driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		WebElement password = driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		WebElement submit = driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
		email.sendKeys("amit.banger4@gmail.com");
		password.sendKeys("ABamit@123");
		submit.click();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Redimi Note 4");
		WebElement SearchSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		SearchSubmit.click();
		Thread.sleep(3000);
		WebElement select = driver.findElement(By.xpath("//div//div//div[contains(text(),'(Dark')]"));
		select.click();
		//switch to window code
		IRCTCLogin obj = new IRCTCLogin();
		//get the title of new window
		String title="Redmi Note 4 (Dark Grey, 64 GB) Online at Best Price with Great Offers Only On Flipkart.com";
		obj.switchTowindow(title);
		Thread.sleep(2000);
		//buy now
		WebElement bynow =driver.findElement(By.xpath("//div/div/ul/li[2]/form/button"));
		bynow.click();
		Thread.sleep(10000);
		driver.quit();
	}
	public void switchTowindow(String title){
		Set <String> handles =driver.getWindowHandles();
		for(String handle:handles)
		{
			driver.switchTo().window(handle);
		if(driver.getTitle().contains(title)){
			break;
		}}

	}
}
