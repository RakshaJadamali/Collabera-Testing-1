package Raks;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePositionOfBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().setPosition(new Point(100,50));
		/*or
		 * Point p=new Point(100,50);
		 * driver.manage().window().setPosition(p);
		 */
		
		

	}

}
