package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		driver.get("https://google.com/");
	}

	@When("user enters a text in search field")
	public void user_enters_a_text_in_search_field() {
		System.out.println("user enters text in field");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user navigated to search results");
		
	}

}
