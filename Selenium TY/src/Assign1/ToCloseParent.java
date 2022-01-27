package Assign1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	    String parentPage = driver.getWindowHandle();
		driver.close();
		

	}

}
