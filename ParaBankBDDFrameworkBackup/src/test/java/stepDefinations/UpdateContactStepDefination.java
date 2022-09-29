package stepDefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpdateContactStepDefination {

WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

	}

	@When("^title of login page is$")
	public void title_of_login_page_is(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("ParaBank | Welcome | Online Banking", title);
	}
	
	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"	

	
	@Then("^user enters username and password$")
		
		public void user_enters_username_and_password(DataTable credentials) throws InterruptedException{
		
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
	
		Thread.sleep(1000);
	}}

	@Then("^user click on SignIn$")
	public void user_click_on_SignIn() throws InterruptedException{
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@class='button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(2000);
	}
	
	@Then("^user is on HomePage$")
	public void user_is_on_HomePage() {
		String title = driver.getTitle();
		System.out.println("HomePage title is::"+ title);
		Assert.assertEquals("ParaBank | Accounts Overview", title);		
	}
	
	
	@Then("^user goes in UpdateContact Page$")
	public void user_goes_in_UpdateContact_Page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Update Contact Info']")).click();
		Thread.sleep(2000);
	}
	

	@Then("^user update profile details$")
	public void user_update_profile_details(DataTable proData) throws InterruptedException {	
		
			driver.manage().deleteAllCookies();
		for(Map<String, String> data : proData.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(data.get("fname"));
			driver.findElement(By.id("customer.lastName")).sendKeys(data.get("lname"));
			driver.findElement(By.id("customer.address.street")).sendKeys(data.get("address"));
			driver.findElement(By.id("customer.address.city")).sendKeys(data.get("city"));
			driver.findElement(By.name("customer.address.state")).sendKeys(data.get("state"));
			driver.findElement(By.id("customer.address.zipCode")).sendKeys(data.get("zip"));
			driver.findElement(By.id("customer.phoneNumber")).sendKeys(data.get("phone"));
			
			Thread.sleep(2000);
		}
	}
	
	@Then("^logout and close browser$")
	public void logout_and_close_browser() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
