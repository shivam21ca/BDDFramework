/*
package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
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

	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
		
		public void user_enters_username_and_password(String username, String password) throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(1000);
	}

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
	
	@Then("^user moves to BillPay$")
	public void user_moves_to_BillPay() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Bill Pay']")).click();
		Thread.sleep(2000);
	}	
	
	@Then("^enter bill details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void enter_bill_details_payee_address(String payee, String address, String city, String state, String zip, String phone, String accno, String verifyacc, String amt) throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys(payee);
		driver.findElement(By.name("payee.address.street")).sendKeys(address);
		driver.findElement(By.name("payee.address.city")).sendKeys(city);
		driver.findElement(By.name("payee.address.state")).sendKeys(state);
		driver.findElement(By.name("payee.address.zipCode")).sendKeys(zip);
		driver.findElement(By.name("payee.phoneNumber")).sendKeys(phone);
		driver.findElement(By.name("payee.accountNumber")).sendKeys(accno);
		driver.findElement(By.name("verifyAccount")).sendKeys(verifyacc);
		driver.findElement(By.name("amount")).sendKeys(amt);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
		Thread.sleep(2000);
	}
	
	@Then("^find transaction done by \"(.*)\"$")
	public void find_transaction_done_by(String amt) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Find Transactions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys(amt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ng-binding']")).click();
		Thread.sleep(2000);
	}
	
	@Then("^logout and close browser$")
	public void logout_and_close_browser() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();

	}	
}

*/