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

public class Login {

	public WebDriver driver;
	
	@Given("browser will be opened")
	public void browser_will_be_opened() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@And("user will be on CRM login page")
	public void user_will_be_on_crm_login_page() {
		driver.get("http://localhost:8888/");
	}

	@When("user is entering username and password")
	public void user_is_entering_username_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");

	}

	@And("clicking on login button")
	public void clicking_on_login_button() {
		driver.findElement(By.id("submitButton")).click();;
	}

	@Then("user is navigated to HomePage of CRM")
	public void user_is_navigated_to_home_page_of_crm() throws InterruptedException {
		WebElement home = driver.findElement(By.partialLinkText("Home"));
		if (home.isDisplayed()) {
			System.out.println("User is navigated to Home page...!!!");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
