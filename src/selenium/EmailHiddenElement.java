package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailHiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement hidden = driver.findElement(By.name("reg_email_confirmation__"));
		JavascriptExecutor js=(JavascriptExecutor) driver; //typecasting
        js.executeScript("arguments[0].value='raksha@gmail.com';",hidden );//hidden is object and value is the attribute 
		driver.findElement(By.name("reg_email__")).sendKeys("raksha@gmail.com");//we are entering value for re-enter mail textfield
}

}
