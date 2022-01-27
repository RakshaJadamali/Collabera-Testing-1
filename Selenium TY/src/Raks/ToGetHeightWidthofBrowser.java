package Raks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetHeightWidthofBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.dominos.co.in/");
		Dimension dimen=driver.manage().window().getSize();
		int heig=dimen.getHeight();
		int widt=dimen.getWidth();
		System.out.println("Height: "+heig+" & width: "+widt);

	}

}
