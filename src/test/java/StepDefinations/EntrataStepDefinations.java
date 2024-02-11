package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.EntrataHomePO;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EntrataStepDefinations {
	
	TestContextSetup TC;
	 public EntrataStepDefinations(TestContextSetup TC)
	 {
		 this.TC=TC;
	 }


	@Given("the chrome is launched")
	public void the_chrome_is_launched() {
		TC.driver = WebDriverManager.chromedriver().create();

		// System.setProperty("webdriver.chrome.driver.", "Drivers/chromedriver.exe");
		// driver= new ChromeDriver();
		//System.out.println("sushmita");
	}

	@When("url is hit")
	public void url_is_hit() throws InterruptedException {
		TC.driver.get("https://www.entrata.com");
		Thread.sleep(4000);
		TC.driver.manage().window().maximize();	}

	@Then("launches to the home page and accept the cookies")
	public void launches_to_the_home_page_and_accept_the_cookies() throws InterruptedException {
		System.out.println(TC.driver.getTitle());
		Thread.sleep(3000);
		EntrataHomePO entrataPO= new EntrataHomePO(TC.driver);

		entrataPO.Confirm_Cookies();
		Thread.sleep(3000);
	}
	
	@When("user hover upon the Products")
	public void user_hover_upon_the_products() throws InterruptedException {
		
		WebElement e=TC.driver.findElement(By.xpath("(//div[@class='main-nav-link'])[1]"));
		Actions act = new Actions(TC.driver);
		act.moveToElement(e).perform();
		Thread.sleep(3000);
	}

	@When("clicks on the Entrata Business Intelligence")
	public void clicks_on_the_entrata_business_intelligence() throws InterruptedException {
		WebElement e1=TC.driver.findElement(By.xpath("(//a[@class='fat-nav-header'])[1]"));
		Actions act2= new Actions(TC.driver);
		act2.moveToElement(e1).perform();
		System.out.println(e1.getText());
		Thread.sleep(3000);
		
		
		EntrataHomePO entrataPO= new EntrataHomePO(TC.driver);

		entrataPO.ClickBI();
		Thread.sleep(3000);
	}

	@Then("lands to the BI page and goes to the previous page")
	public void lands_to_the_bi_page_and_goes_to_the_previous_page() throws InterruptedException {
		System.out.println(TC.driver.getCurrentUrl());
		Thread.sleep(3000);
		TC.driver.navigate().back();
		Thread.sleep(5000);
	}

	

}
