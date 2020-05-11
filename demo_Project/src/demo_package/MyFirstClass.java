package demo_package;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	// WebDriver driver;
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KREDDI\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.get("http://practice.automationtesting.in/");

	}

}
