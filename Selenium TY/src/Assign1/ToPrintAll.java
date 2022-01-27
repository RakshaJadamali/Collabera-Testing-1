package Assign1;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToPrintAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String ParentWindow=driver.getWindowHandle();
		Set<String> allwindowTitle=driver.getWindowHandles();
		allwindowTitle.remove(ParentWindow);
		for(String WindowTitle:allwindowTitle) {
		System.out.println(driver.switchTo().window(WindowTitle).getTitle());
		}
		System.out.println(driver.switchTo().window(ParentWindow).getTitle());
		}
		}

		

	


