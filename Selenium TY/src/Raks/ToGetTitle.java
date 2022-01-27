package Raks;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.careercup.com/");
		String d=driver.getTitle();
		System.out.println(d);
		

	}

}
