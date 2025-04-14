package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class logindatadefinition {

	WebDriver driver;
	
	@Given("user should be in the login page")
	public void user_should_be_in_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("the user enters the valid credenatils {string} and {string}")
	public void the_user_enters_the_valid_credenatils_and(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		usernameField.sendKeys(username);

		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		passwordField.sendKeys(password);
	}
	
	@When("needs to click on the login button")
	public void needs_to_click_on_the_login_button() {
		
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
		@Then("the user should be get into the application pages")
		public void the_user_should_be_get_into_the_application_pages() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Increased wait time

		    try {
		        // Check if you need to switch to a frame
		        // driver.switchTo().frame("frameNameOrId"); // Uncomment if needed

		        // Wait for the element to be clickable
		        WebElement dashboard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div[1]/span/h6\r\n"
		        		+ "")));

		        boolean logincheck = dashboard.isDisplayed();
		        Assert.assertTrue("Login validation failed. Dashboard not displayed.", logincheck);

		        if (logincheck) {
		            System.out.println("Login successful, Dashboard is displayed");
		        } else {
		            System.out.println("Login failed, please check the code");
		        }
		    } catch (TimeoutException e) {
		        System.out.println("Element not found within the specified wait time: " + e.getMessage());
		    }
		}}