package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add3ProductsToFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("iPhone");//we can take name() as q because serach textfield will be having q
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).click();
		addToCart(driver,"Buy Apple iPhone 12 Mini ( 64 GB Storage ) Online at Best Price On Flipkart.com");
	
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Samsung");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Celestial Black, 64 GB)']")).click();
		addToCart(driver,"SAMSUNG Galaxy F12 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com");
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Vivo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='vivo Y12G (Phantom Black, 32 GB)']")).click();
		addToCart(driver,"vivo Y12G ( 32 GB Storage, 3 GB RAM ) Online at Best Price On Flipkart.com");
	}

	public static void addToCart(WebDriver driver, String expectTitle) {
		// TODO Auto-generated method stub
		String pareWind=driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		allWin.remove(pareWind);
		
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
		driver.switchTo().window(pareWind);
		}
		
	}


