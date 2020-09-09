package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;

public class logintestSteps 
{
	
	WebDriver driver= null;
	loginpage login;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		
	}

	@And("user is on login page")
	public void user_is_on_google_search_page() throws InterruptedException 
	{
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("user enters username and password")
	public void user_enter_a_text_in_searh_box() 
	{
		//driver.findElement(By.id("name")).sendKeys("naresh");
		login = new loginpage(driver);
		login.enterusername("naresh");
		login.enterpassword("12345");
		//driver.findElement(By.id("password")).sendKeys("12345");

	}

	@And("user clciks on login button")
	public void hits_enter() 
	{
		//driver.findElement(By.id("login")).click();
		login.clicklogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_search_result() 
	{
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
