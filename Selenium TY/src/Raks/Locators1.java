package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("Raksha");
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Elemental Selenium")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.className("subheader")).click();//Not displaying when it is clicked because it's a text
	    Thread.sleep(3000);
	    
	    
		

	}

}
