package selenium;

import org.openqa.selenium.Rectangle; 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOverlapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle rect=driver.findElement(By.id("email")).getRect();
		int height=rect.height;//instead of using getHeight() use height 
		int spaceBetween=rect.y;//instead of using getY() use y,we are using y because measuring distance between 2 textfield along y axis
	    Rectangle rect2=driver.findElement(By.id("passContainer")).getRect();
	    int spaceBetwen = rect2.y;
		final int SPACE = 5;
		if(height+spaceBetween+SPACE<=spaceBetwen)
		{
			System.out.println("it is not clashing");
		}
	    else
	    {
	    	System.out.println("it is not clashing");
	    }
	}

}