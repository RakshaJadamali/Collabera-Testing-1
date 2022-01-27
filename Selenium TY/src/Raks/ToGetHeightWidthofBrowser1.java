package Raks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ToGetHeightWidthofBrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.skillrary.com/");
		Dimension dimen=driver.manage().window().getSize();
		System.out.println("Height: "+dimen.getHeight()+" and width: "+dimen.getWidth());
	
		
	}
}
