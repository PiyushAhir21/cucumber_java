package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCRM {

	WebDriver driver ;
	
	@Given("browser is opened")
	public void browser_is_opened() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@And("user is on CRM login page")
	public void user_is_on_crm_login_page() {
		driver.get("http://localhost:8888/");
		
	}

	@When("^user enters username and password$")
	public void user_enters_un_and_pwd() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
	}
	
	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("user is navigated to Home Page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		WebElement home = driver.findElement(By.partialLinkText("Home"));
		if (home.isDisplayed()) {
			System.out.println("User is navigated to Home page...!!!");
		}
		Thread.sleep(3000);
		driver.close();
	}


}
