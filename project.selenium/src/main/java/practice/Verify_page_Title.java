package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_page_Title {
	
	

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.crome.driver","E:\\software Automation testing\\EAL_Project\\project.selenium\\Drivers\\chromedriver.exe ");

			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			driver.manage().window().maximize();
		String HomepageTitle=driver.getTitle();
		System.out.println(HomepageTitle);
		if(HomepageTitle.equals("Google")) {
			System.out.println("Title is correct -Google");
		}
			else{
				System.out.println("Title is incorrect-No Google");
			}
		driver.close();
		}
	
		}

	
