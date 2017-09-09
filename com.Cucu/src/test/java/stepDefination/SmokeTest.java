package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;

	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\StudyMaterial\\Selenium\\Requried\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("testUser");
		driver.findElement(By.id("pass")).sendKeys("testUser");

	}

	@Then("^user should be able tp login successfully$")
	public void user_should_be_able_tp_login_successfully() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();
		driver.close();

	}

}
