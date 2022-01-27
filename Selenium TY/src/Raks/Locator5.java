package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("aaa");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='go']")).click();
		}

}
