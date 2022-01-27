package Raks;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.naukri.com/");
        driver.quit();
		
}
}
