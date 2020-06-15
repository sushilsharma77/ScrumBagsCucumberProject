package com.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("user navigate to url")
	public void user_navigate_to_url() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");

	}

	@When("user login with {string} and {string}")
	public void user_login_with_and(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("user see Synatax logo")
	public void user_see_Synatax_logo() throws InterruptedException {
		boolean expected = true;
		WebElement logo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		boolean actual = logo.isDisplayed();
		Assert.assertEquals("logo is not displayed", expected, actual);
		Thread.sleep(3000);
		driver.quit();

	}

}
