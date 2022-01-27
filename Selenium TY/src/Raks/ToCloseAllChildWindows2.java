package Raks;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToCloseAllChildWindows2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWinID=driver.getWindowHandles();
		String expectedParentPageTitle="Jobs - Recruitment - Job Search -  Employment -Job Vacancies - Naukri.com";
		for(String s:allWinID)
		{
			driver.switchTo().window(s);
			String actualPageTitle=driver.getTitle();
			if(!expectedParentPageTitle.equals(actualPageTitle))
			{
				driver.close();
				
			}
		}
		

	}

}
