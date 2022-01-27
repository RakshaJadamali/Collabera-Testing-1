package Raks;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParticularWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String particularpage=driver.getWindowHandle();
		for(String s:particularpage)
		{
			driver.close();
		}
		
		

}

}
