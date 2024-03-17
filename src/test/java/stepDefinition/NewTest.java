package stepDefinition;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("@Test");
  }
  
  
  @Test
  public void f1() {
	  
	  System.out.println("@Test2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("@After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@Before Class");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("@After calss");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("@before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("@After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("@beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("@after suite");
  }

}
