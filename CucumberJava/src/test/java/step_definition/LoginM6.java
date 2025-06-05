package step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginM6 {
	WebDriver driver ;
	
	@Given("Browser is opened")
	public void browser_is_opened() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		driver.get("http://49.249.28.218:8888/");
	}

	@When("User enters un and pwd")
	public void user_enters_un_and_pwd() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
	}

	@When("click on loginBtn")
	public void click_on_login_btn() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("user should be redirected to HP")
	public void user_should_be_redirected_to_hp() {
		WebElement loginLogo = driver.findElement(By.cssSelector("img[alt='vtiger-crm-logo.gif']"));
		if (loginLogo.isDisplayed()) {
			System.out.println("User logged in to home page...");
		}else {
			System.out.println("Fir se kr bhai/bahen");
		}
		
		driver.quit();
	}

}
