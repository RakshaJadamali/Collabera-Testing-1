package Assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
	 String Text=driver.findElement(By.linkText("SIGN UP")).getText();
	System.out.println(Text);

	}

}
