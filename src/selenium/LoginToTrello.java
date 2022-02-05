package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("https://trello.com/login");
       
       driver.findElement(By.id("user")).sendKeys("raksjada@gmail.com");
       
       WebDriverWait explicitWait=new WebDriverWait(driver,10);
       explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='password']")));//its waiting for password textfield to vanish
       driver.findElement(By.id("login")).click();
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("raksha@123");
       driver.findElement(By.id("login-submit")).click();
       driver.findElement(By.xpath("//div[text()='Selenium']")).click();
       
       Actions actions=new Actions(driver);
       Thread.sleep(3000);
       explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='To Do']")));
       WebElement sdlc=driver.findElement(By.xpath("//span[text()='SDLC']"));
       Thread.sleep(3000);
       
       actions.clickAndHold(sdlc).moveByOffset(400,149).perform();
       Thread.sleep(3000);
       actions.release().perform();
       
     
       
	}

}
