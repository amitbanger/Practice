package Practice;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
@Test
public class RemoteWebDriver{
	WebDriver driver;
	DesiredCapabilities capability = DesiredCapabilities.chrome();
	driver = new RemoteWebdriver(new URL("https://stackoverflow.com/questions/12836114/selenium-webdriver-remote-setup"), capability);

}
