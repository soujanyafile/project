package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdProduct6000 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("catwalk sandals");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Women Blue Flats Sandal")).click();
		String value=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		String price=value.toString();
		String pric=price.replaceAll("[^\\d.]","");
		int val = Integer.parseInt(pric);
		System.out.println(val);
		if(val<=6000)
		{
			String parentWin = driver.getWindowHandle();
			Set<String> allWin = driver.getWindowHandles();
			allWin.remove(parentWin);
			String expectTitle="Fashion Tails Women Black Heels - Buy Fashion Tails Women Black Heels Online at Best Price - Shop Online for Footwears in India | Flipkart.com";
			for(String s:allWin)
			{
				driver.switchTo().window(s);
				String actuTitle=driver.getTitle();
				if(expectTitle.equals(actuTitle))
				{
					System.out.println("driver switched control to a parent page");
				}
				
			}
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
		}
			else
			{
				System.out.println("watch price is greater than 6000");
			}	
		}
	}

