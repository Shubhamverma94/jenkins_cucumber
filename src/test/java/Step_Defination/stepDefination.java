package Step_Defination;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefination {
	WebDriver driver; 
	   
@Given("I should be on login page")
public void i_should_be_on_login_page() {
	   WebDriverManager.edgedriver().setup();
	   driver = new EdgeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	
}

@When("enter the username {string}")
public void enter_the_username(String string) {
	System.out.println(string);
	 driver.findElement(By.name("username")).sendKeys(string);
}

@When("enter the password {string}")
public void enter_the_password(String string) {
	System.out.println(string);
	 driver.findElement(By.name("password")).sendKeys(string);
}

@When("click on the login button")
public void click_on_the_login_button() {
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}

@Then("i should see the {string}")
public void i_should_see_the(String string) {
    Assert.assertTrue(driver.findElement(By.linkText("PIM")).isDisplayed());
    System.out.println("Login Success and found PIM");
    driver.close();
}

}
