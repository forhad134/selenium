package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ibrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","E:\\software Automation testing\\EAL_project_java\\project.selenium\\Drivers\\chromedriver.exe ");

		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		String sessionID=driver.getWindowHandle();
		System.out.println(sessionID);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
	}

}
