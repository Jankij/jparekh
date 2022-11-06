package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Searchclass {
	@Given("^I am on google page \"([^\"]*)\"$")
	public void i_am_on_google_page(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(toString());
// Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I search = \"([^\"]*)\"$")
	public void i_search(String arg1) throws Throwable {
	    RemoteWebDriver driver = null;
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(toString());
  
	}

	@When("^I click on google search button$")
	public void i_click_on_google_search_button() throws Throwable {
		 By driver = null;
		driver.findElement((SearchContext) By.name("btnK")).submit();
   // Write code here that turns the phrase above into concrete actions
	    
	}
}
