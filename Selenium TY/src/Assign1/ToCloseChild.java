package Assign1;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCloseChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String expectedParentPage=driver.getWindowHandle();
		Set<String> allWinID=driver.getWindowHandles();
		allWinID.remove(expectedParentPage);
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
			Thread.sleep(2000);
			driver.close();
		}

	}

}
