package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCrmE2 {

	WebDriver driver;
	
	@Given("user should be at localhost8888")
	public void user_should_be_at_localhost8888() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");
	}

	@When("user enters un and pwd in vtiger")
	public void user_enters_un_and_pwd_in_vtiger() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
	}

	@And("click on loginBtn element")
	public void click_on_login_btn_element() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("home page should be displayed successfully")
	public void home_page_should_be_displayed_successfully() throws InterruptedException {
		Thread.sleep(5000);
		boolean status = driver.findElement(By.partialLinkText("Home")).isDisplayed();
		if (status) {
			System.out.println("Logged in successfully...");
		}else {
			System.out.println("Login failed...");
		}
	}
}
