package maveen

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class jenkin {
WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElement(By.name("userName")).sendKeys("demo");
	  driver.findElement(By.name("password")).sendKeys("demo");
	  driver.findElement(By.name("login")).click();
  }
  
  
 hello 
  @BeforeTest
  public void beforeTest() {
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://newtours.demoaut.com/index.php");
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
