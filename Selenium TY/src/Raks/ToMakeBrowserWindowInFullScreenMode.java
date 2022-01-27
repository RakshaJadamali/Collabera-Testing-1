package Raks;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToMakeBrowserWindowInFullScreenMode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.co.in/");
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		
		
		
}

}
