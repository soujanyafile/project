package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZaraLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testUrl="https://www.zara.com/in/";
		String email="raksjada@gmail.com";
		String password="Raksha12";
		String expectedLoginPageTitle="ZARA India | SALE";
		String expectedLoginPageTitle1="LOG IN / CREATE ACCOUNT - ZARA India - Official Website";
		String expectedHomePageTitle="ZARA India | SALE";
		
		//Step 1:Open the browser and enter the URL
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Broswer maximized successfully");
		WebDriverWait explicitWait=new WebDriverWait(driver,10);
		driver.get(testUrl);
		String actualLoginPageTitle=driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle))
		{
			System.out.println("Login page displayed successfully");
		}
		else
		{
			System.out.println("Login page not displayed successfully");
		}
		
		//Step 2:Click on Login icon
		driver.findElement(By.xpath("//span[text()='LOG IN']")).click();
		String actualLoginPageTitle1=driver.getTitle();
		String expectedLoginPageTitle2=driver.getTitle();
		if(expectedLoginPageTitle2.equals(actualLoginPageTitle1))
		{
			System.out.println("Home page displaed successfully");
		}
		else
		{
			System.out.println("Home page not displayed successfully");
		}
		
		//Step 3:Enter the email-id into email text field
		WebElement emailidTextField=driver.findElement(By.name("logonId"));
		emailidTextField.clear();
		emailidTextField.sendKeys(email);
		String actualEmailidEntered=emailidTextField.getAttribute("value");
		if(actualEmailidEntered.equals(email))
		{
			System.out.println("Email id is entered correctly");
		}
		else
		{
			System.out.println("Email id is not entered correctly");
		}
		
		//Step 4:Enter password into the password textfield
		WebElement passwordTextField=driver.findElement(By.name("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualPasswordEntered=passwordTextField.getAttribute("value");
		if(actualPasswordEntered.equals(password))
		{
			System.out.println("Passowrd is entered correctly");
		}
		else
		{
			System.out.println("Passowrd is not entered correctly");
		
		}
		
		//Step 5:Click on Login button
		driver.findElement(By.xpath("//span[text()='LOG IN']")).click();
		explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle=driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle))
		{
			System.out.println("Home page displayed successfully");
		}
		else
		{
			System.out.println("Home page not displayed successfully");
		}

}
}
