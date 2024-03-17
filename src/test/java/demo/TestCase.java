package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.POM;

public class TestCase {
	private static WebDriver driver = null;
	@Test
	public void LaunchBrowser() {
	driver = WebDriverManager.chromedriver().create();
	driver.navigate().to("https://www.naukri.com/");
	
	}
	@Test
	public void LoginFunction() throws InterruptedException {
	PageFactory.initElements(driver, POM.class);
	POM.LoginButton.click();
	Thread.sleep(2000);
	//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	//jsExecutor. executeScript("");
	POM.UserName.sendKeys("chityrichu@gmail.com");
	POM.Password.sendKeys("Richu@123");
	POM.SubmitButton.click();
	
	}
	

}
