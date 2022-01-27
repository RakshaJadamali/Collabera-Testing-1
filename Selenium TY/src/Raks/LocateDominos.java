package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateDominos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/");
		driver.findElement(By.xpath("//span[text()='Delivery']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("//input[text()='esc']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Pick Up/Dine-in'])"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("//input[text()='Enter your delivery address']")).sendKeys("Kumarswamy Layout");
		
}

}
