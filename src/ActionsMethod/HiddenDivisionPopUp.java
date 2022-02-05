package ActionsMethod;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		LocalDateTime Idt =LocalDateTime.now().plusMonths(6);
		String month= Idt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date=Idt.getDayOfMonth();
		int yerr=Idt.getYear();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		Actions actions=new Actions(driver);
		actions.moveToElement((WebElement) By.xpath("//span[@class='langCardClose']")).click();
		
		
		
		

	}

}
