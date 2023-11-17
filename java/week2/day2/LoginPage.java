package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("prabha");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		//driver.close();

	}

}
