package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","E:\\software Automation testing\\EAL_project_java\\project.selenium\\Drivers\\chromedriver.exe ");
driver=new ChromeDriver();
driver.get("https://www.amazon.com");;
Thread.sleep(2000);
driver.navigate().refresh();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.close();
	
	}	

}
