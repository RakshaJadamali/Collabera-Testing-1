package Assign1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWindow=driver.getWindowHandles();
		for(String WindowId:allWindow) {
			driver.switchTo().window(WindowId);
			if(driver.getTitle().equalsIgnoreCase("Tech Mahindra")) {
				
			
		driver.close();
		}
	}

	}

}
