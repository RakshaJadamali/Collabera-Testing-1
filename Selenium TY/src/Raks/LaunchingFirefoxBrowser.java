package Raks;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchingFirefoxBrowser {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}

}
