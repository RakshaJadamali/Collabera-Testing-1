package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCareer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careercup.com");
		driver.findElement(By.linkText("Questions")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='st-search-input']")).sendKeys("Java");
		
		}

}
