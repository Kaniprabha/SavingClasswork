package abhibus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBooking {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class=' col'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("(//div[@class=' col'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		
		driver.findElement(By.xpath("(//a[@class='btn active text tertiary md active button'])[2]")).click();
		//driver.findElement(By.xpath("//span[text()='11']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		String text = driver.findElement(By.xpath("//h5[text()='TSRTC']")).getText();
		System.out.println("Name of the Bus: "+text);
		
		String text2 = driver.findElement(By.xpath("//small[text()=' Seats Available']")).getText();
		System.out.println("Available Seats: "+text2);
		
		driver.findElement(By.xpath("//div[@class='row ']//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//p[text()='L.b.nagar- C.coffee Day']")).click();
		driver.findElement(By.xpath("(//div[@class='Tooltip-Wrapper '])[13]")).click();
	
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		System.out.println("Seat Selected...");
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		driver.close();
		
//
	}

}
