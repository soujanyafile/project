package selenium;

import org.openqa.selenium.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheck2TextfieldSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    Rectangle rec = driver.findElement(By.id("email")).getRect();
	    System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		Rectangle rec2=driver.findElement(By.id("passContainer")).getRect();//passContainer is used because it selects the whole textfield but not pass because it doesn't select whole textfield
		System.out.println(rec2.getY());
		System.out.println(rec2.getX());
		System.out.println(rec2.getHeight());
		System.out.println(rec2.getWidth());
		
		

	}

}
