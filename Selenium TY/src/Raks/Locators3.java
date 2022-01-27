package Raks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(3000);
		//driver.findElement(By.id("nav-orders")).click();
		//driver.findElement(By.linkText("Returns")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div[id='nav-iss-attach']")).sendKeys("Hair dryer");
		//Thread.sleep(3000);
		//driver.findElement(By.id("nav-cart-text-container")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-global-location-popover-link")).click();
		Thread.sleep(3000);
		
		}

}
