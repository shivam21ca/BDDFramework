/*

package stepDefinations;

import java.util.List;

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

public class ContactStepDefination {

	
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
		List<List<String>> data = credentials.raw();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
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
	
	@Then("^user move to contactpage$")
	public void user_move_to_contactpage() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='contact']")).click();
	}
	
		
	@Then("^user enter name email phone message$")
	public void user_enter_name_email_phone_message(DataTable contactData) throws InterruptedException {
		Thread.sleep(2000);
		List<List<String>> contactValue = contactData.raw();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(contactValue.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(contactValue.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(contactValue.get(0).get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(contactValue.get(0).get(3));;
		
	}

	
	@Then("^logout and close browser$")
	public void logout_and_close_browser() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}

*/
