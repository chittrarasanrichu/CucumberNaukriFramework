package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 

public class LoginPage {
	
	WebDriver driver ;
	ExtentReports extentreport;
	ExtentSparkReporter htmlreporter;
	ExtentTest testcase;
	
	@Before // hooke contecpt used to run first in the scenrio in stepdefinition
	public void open_the_browser() {
		extentreport = new ExtentReports();
		htmlreporter = new ExtentSparkReporter("ExtentReport.html");
		extentreport.attachReporter(htmlreporter);
		
		 driver = WebDriverManager.chromedriver().create();
		driver.get("https://letcode.in/");
	   
	}

	@Given("open the browser")
	public void max_browser() {
		testcase = extentreport.createTest("maximaise window");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	   
	}

	@When("enter the username and password")
	public void enter_the_username_and_password() {
		testcase = extentreport.createTest("Username & password");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("nragunath2001@gmail.com");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Ragunath@2001");
		
		
		
		
	  
	}

	@When("click  on the SubmitButton")
	public void click_on_the_submit_button() {
		testcase = extentreport.createTest("LoginButton");
		
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	  
	}

	@Then("Verify the Current Title")
	public void verify_the_current_title() {
		testcase = extentreport.createTest("Verification");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 String NewCourse = driver.findElement(By.linkText("New Course!")).getText();  
	 Assert.assertEquals(NewCourse, "New Course!");
	 extentreport.flush();
	 driver.close();
	}

}
