package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDefinitions {
    WebDriver driver;

    @Given("user is entering google.co.in")
    public void user_is_entering_google_co_in() {
        // Set up WebDriver and navigate to Google
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
    }

    @When("user is typing the search term {string}")
    public void user_is_typing_the_search_term(String searchTerm) {
        // Find the Google search box and type the search term
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
    }

    @When("enters the return key")
    public void enters_the_return_key() {
        // Submit the search form (press Enter)
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.submit();
    }

    @Then("the user should see the search results")
    public void the_user_should_see_the_search_results() {
        // Verify that search results are displayed
        boolean resultsDisplayed = driver.findElement(By.id("search")).isDisplayed();
        if (resultsDisplayed) {
            System.out.println("Search results are displayed");
        } else {
            System.out.println("Search results are NOT displayed");
        }

        // Close the browser
        driver.quit();
    }
}