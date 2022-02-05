package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakess1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
	    
		File tempfile = driver.getScreenshotAs(OutputType.FILE);//ss of webpage
		System.out.println(tempfile);
		File dest=new File("./pics/scre2.jpg");
		FileUtils.copyFile(tempfile, dest);
		
		File webscreen=driver.findElement(By.linkText("Sign up")).getScreenshotAs(OutputType.FILE);//ss of web element
		System.out.println(webscreen);
		File webscreen1=new File("./pics/wescre2.jpg");
		FileUtils.copyFile(webscreen, webscreen1);
        

	}

}
