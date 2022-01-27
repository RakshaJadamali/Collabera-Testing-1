package Raks;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToSwitchParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWinID=driver.getWindowHandles();
		String expectedTitle="ICICI";
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
			String actualTitle=driver.getTitle();
			if(expectedTitle.equals(actualTitle))
			{
				driver.manage().window().maximize();
				break;
			}
		}
		

	}

}
