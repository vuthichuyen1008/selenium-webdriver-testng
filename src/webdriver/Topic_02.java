package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}

	@Test
	public void TC_01() {
		driver.get("https://live.techpanda.org/index.php/customer/account/login/");
		
		// <input type="email" 
		// autocapitalize="off" 
		// autocorrect="off" 
		// spellcheck="false" 
		// name="login[username]" 
		// value="" id="email" 
		// class="input-text required-entry validate-email" 
		// title="Email Address">
		
		driver.findElement(By.id("email"));
		driver.findElement(By.className("new-users"));
		driver.findElement(By.name("login[username]"));
		driver.findElements(By.tagName("a"));
		driver.findElement(By.linkText("ABOUT US"));
		
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@name='login[username]']"));
		
		driver.findElement(By.cssSelector("input[id='email']"));
		driver.findElement(By.cssSelector("input[name='login[username]']"));
	}


	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
