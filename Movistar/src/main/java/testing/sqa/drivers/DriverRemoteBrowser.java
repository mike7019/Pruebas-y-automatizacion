package testing.sqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverRemoteBrowser {


	public static WebDriver driver;

	public static DriverRemoteBrowser chromeHisBrowserWeb() {
		
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--headless");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars;--no-sandbox;--test-type");
		options.addArguments("--ignore-certificate-errors;--incognito;--disable-gpu;--no-sandbox");



		driver = new ChromeDriver(options);
		return new DriverRemoteBrowser();
	}
	
	public static DriverRemoteBrowser firefoxHisBrowserWeb()
	{
		driver = new FirefoxDriver();
		return new DriverRemoteBrowser();
	}
	
	public static DriverRemoteBrowser internetExplorerHisBrowserWeb()
	{
		driver = new InternetExplorerDriver();
		return new DriverRemoteBrowser();
	}
	
	public static WebDriver on(String url) {
		driver.get(url);
		return driver;
	}
}