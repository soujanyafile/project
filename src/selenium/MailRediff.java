package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailRediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2' and @placeholder='Enter name or email']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Raksha");
		Thread.sleep(2000);
		
		WebElement frame =driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(frame);//it will get inside the frame
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello everyone");//we are passing inputs to body
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(2000);
		
		for(;;)//we are infinitie for loop because there's a captcha and to refresh the page again and again
		{
			try 
			{
				driver.findElement(By.xpath("//li[@sender='Sumanth' and @subject='Arpitha G']")).click();
				driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				driver.navigate().refresh();
			}
		
		
	
		
		}
}
}
