package Raks;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> allWindowIds=driver.getWindowHandles();
		for(String s:allWindowIds)
		{
			System.out.println(s);
		}
		driver.quit();
		

	}

}
