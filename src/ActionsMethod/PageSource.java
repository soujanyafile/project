package ActionsMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);
	}

}
