package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.oyorooms.com/");
		
		driver.findElement(By.xpath("//span[text()='Fri, 25 Jan']/../../..//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='June']/..//span[text()='2022']/../..//span[text()='12']")).click();
				driver.findElement(By.xpath("//span[text()='July']/..//span[text()='2022']/../..//span[text()='16']")).click();
break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//div[@class='DateRangePicker__PaginationArrow DateRangePicker__PaginationArrow--next']")).click();
			}
		}
	}

}
