package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement w = driver.findElement(By.id("username"));
		w.sendKeys("Raksha");
		System.out.println(w.getAttribute("w"));//Whatever is stored in the textfield everything will be stored in getAttribute
		//Output will be null because if we inspect username texfield value attribute is not stroring any value when we enter in username 
		
		}

}
