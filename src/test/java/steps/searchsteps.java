package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchsteps {
	
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theuserisintheindexpage() {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.navigate().to("https://demo.testfire.net/index.jsp");
		
		
	}

	@When ("enter the website with username and password")
	public void usersEnterDressesinSearchBar () {
		
		driver.findElement(By.id("LoginLink")).click();
		
		driver.findElement(By.id("uid")).sendKeys("Jsmith");
		
		driver.findElement(By.id("passw")).sendKeys("Demo1234");
		
		driver.findElement(By.name("btnSubmit")).click();
	}
	
	@When ("select transfer funds option")
	public void userClicksSearchButton()
	{
		driver.findElement(By.id("MenuHyperLink3")).click();
	}
	
	@Then ("make a transfer (.*)")
	public void dressesPage(String start)
	{
		Select cuenta1 = new Select (driver.findElement(By.id("fromAccount")));
	     
	      cuenta1.selectByIndex(1);
	      
	      Select cuenta2 = new Select (driver.findElement(By.id("toAccount")));
		     
	      cuenta2.selectByIndex(2);
	      
	      driver.findElement(By.id("transferAmount")).sendKeys(start);
	      
		
		
	}
	
	
}
