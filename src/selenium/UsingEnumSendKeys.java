package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingEnumSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.name("username"));//text present in username will be stored in user
	    user.clear();
		user.sendKeys("Rak","sha","@","gmail.com",Keys.CONTROL+"a");
		Thread.sleep(2000);
		user.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.name("password"));
		Thread.sleep(2000);
		pwd.clear();
		pwd.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
		
		
		
		

	}

}
