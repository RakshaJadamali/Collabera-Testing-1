package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Raksha");
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Selenium")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SEO")).click();
		

	}

}
