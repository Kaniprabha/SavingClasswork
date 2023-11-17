package week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutomateFbLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("testleaf.2023@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Tuna@321");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        driver.findElement(By.linkText("Find your account and log in.")).click();
        String title = driver.getTitle();
        if(title.contains("Forgotten Password")) {
        	System.out.println("Login Successful.");
        }
        else {
        	System.out.println("Login Failed.");
        }
        
        
	}

}
