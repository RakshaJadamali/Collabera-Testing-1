package Raks;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToNavigateToApplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.zomato.com/");
		driver.get("https://www.swiggy.com/");
		
		}

}
