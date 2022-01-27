package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsActi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement untxtfield=driver.findElement(By.id("username"));
		untxtfield.sendKeys("raksha");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("raksha@123");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		
		
		
}

}
