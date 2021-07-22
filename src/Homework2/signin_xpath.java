package Homework2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signin_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Rule 1 //tagname[@attribute='value']
		driver.findElement(By.xpath("//a[@class='login']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@class='login']")).isDisplayed()+"--Sign in button found");
		
		//Rule 2	//tagname[@attribute='value'][@attribute='value']
		driver.findElement(By.xpath("//input[@id='email_create'][@name='email_create']")).sendKeys("Aryan@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[@id='email_create'][@name='email_create']")).isDisplayed()+"--Email address is displayed");
		
		//Rule 3	//tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).click();
		System.out.println(driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).isEnabled()+"--create an account is Clickable");	
		
		//Rule 4	//tagname[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'id_gender1')]")).isSelected()+"-- Mr is selected ");
		
		//Rule 5	//tagname[starts-with(@attribute,'value')and(@attribute='value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'customer_firstname')and(@name='customer_firstname')]")).sendKeys("Aryan");
		System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'customer_firstname')and(@name='customer_firstname')]")).isDisplayed()+"--firstname is displayed");
		
		//Rule 6 //tagname[starts-with(@attribute,'value') or (@attribute='value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'customer_lastn') or (@name='customer_lastn')]")).sendKeys("Ahmed");
		System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'customer_lastn') or (@name='customer_lastn')]")).isDisplayed()+"--lastname is displayed");
		
		//Rule 7	//*[@attribute='value']
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("ar1234");
		System.out.println(driver.findElement(By.xpath("//*[@id='passwd']")).isDisplayed()+"--password is displayed");
		
		//Rule 8	//*[@attribute='value' or @attribute='value']
		WebElement drpdays = driver.findElement(By.xpath("//*[@id='days' or @name='days']")); 
		drpdays.click();
		Select Day = new Select (drpdays);
		Day.selectByIndex(10);
		System.out.println(driver.findElements(By.xpath("//*[@id='days' or @name='days']")).size()+"-- count  ");
		
		//Rule 9	//*[@attribute='value' and @attribute='value']
		WebElement drpmonth = driver.findElement(By.xpath("//*[@id='months' and @name='months']"));
			drpmonth.click();
			Select Month = new Select (drpmonth);
			Month.selectByVisibleText("May ");
			System.out.println(driver.findElements(By.xpath("//*[@id='months' and @name='months']")).size()+"-- count  ");
			
			//Rule 9	//*[@attribute='value' and @attribute='value']
			WebElement drpyears= driver.findElement(By.xpath("//*[@id='years' and @name='years']"));
			drpyears.click();
			Select Year = new Select (drpyears);
			Year.selectByValue("2007");
			System.out.println(driver.findElement(By.xpath("//*[@id='years' and @name='years']")).isEnabled()+"-- Year is enabled ");
			
			//Rule 4	//tagname[starts-with(@attribute,'value')]
			driver.findElement(By.xpath("//input[starts-with(@id,'news')]")).click();
			System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'news')]")).isSelected()+"-- Newsletter is selected ");
			
			//Rule 5	//tagname[starts-with(@attribute,'value')and(@attribute='value')]
			driver.findElement(By.xpath("//input[starts-with(@id,'optin')and(@name='optin')]")).click();
			System.out.println(driver.findElement(By.xpath("//input[starts-with(@id,'optin')and(@name='optin')]")).isSelected()+"--special offer is selected ");
			
			Thread.sleep(2000);
			//Rule 10	//*[@attribute='value' and @attribute='value' or @attribute='value']
			driver.findElement(By.xpath("//*[@id='company' and @name='company' or @class='form-control']")).sendKeys("IBM");
			System.out.println(driver.findElement(By.xpath("//*[@id='company' and @name='company' or @class='form-control']")).isDisplayed()+"--company is displayed");
			
			//Rule 1//tagname[@attribute='value']
			driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("9500 Craigs Mill Dr.");
			System.out.println(driver.findElement(By.xpath("//input[@id='address1']")).isDisplayed()+"--address is displayed");
			
			//Rule 2//tagname[@attribute='value'][@attribute='value']
			driver.findElement(By.xpath("//input[@id='city'][@name='city']")).sendKeys("Glen Allen");
			System.out.println(driver.findElement(By.xpath("//input[@id='city'][@name='city']")).isDisplayed()+"--city is displayed");
			
			//Rule 3//tagname[contains(@attribute,'value')]
			WebElement drpstate= driver.findElement(By.xpath("//select[contains(@id,'id_state')]"));
			drpstate.click();
			Select State = new Select (drpstate);
			State.selectByVisibleText("Virginia");
			System.out.println(driver.findElements(By.xpath("//select[contains(@id,'id_state')]")).size()+"-- count  ");
			
			//Rule 7//*[@attribute='value']
			driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("23060");
			
			//Rule 3//tagname[contains(@attribute,'value')]
			WebElement drpcountry= driver.findElement(By.xpath("//select[contains(@id,'id_country')]"));
			drpcountry.click();
			Select Country = new Select (drpcountry);
			Country.selectByVisibleText("United States");
			
			Thread.sleep(5000);
			driver.close();
			driver.quit();
	}

}
