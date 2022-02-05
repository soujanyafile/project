package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		//we can use submit method when the web element has type as submit and inside form
		
		
		}

}
