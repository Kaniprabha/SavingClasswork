package marathaan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement GenreDD = driver.findElement(By.name("genre"));
		Select genre = new Select(GenreDD);
		genre.selectByVisibleText("ANIMATION");
		
		
		WebElement langDD = driver.findElement(By.name("lang"));
		Select lang = new Select(langDD);
		lang.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted'])[1]//div[text()='Paw Patrol']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cinemaNameDD = driver.findElement(By.id("cinemaName"));
		Select cinemaName = new Select(cinemaNameDD);
		cinemaName.selectByVisibleText("PVR Theyagaraja Thiruvanmiyur Chennai");
			
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//span[@class ='day-unit is-today is-selected is-disabled ng-star-inserted']")).click();
		
		WebElement showTimeDD = driver.findElement(By.name("timings"));
		Select showTime = new Select(showTimeDD);
		showTime.selectByVisibleText("09:00 AM - 12:00 PM");
		
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ragul");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prabharagul35@gmail.com");
	    driver.findElement(By.name("mobile")).sendKeys("8610854096");
		
		WebElement foodDD = driver.findElement(By.name("food"));
		Select food = new Select(foodDD);
		food.selectByVisibleText("Yes");
		
		driver.findElement(By.name("comment")).sendKeys("Enough");
		driver.findElement(By.className("display-block")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String pagetitle = driver.getTitle();
		System.out.println("Title: "+pagetitle);
		
		if(pagetitle.contains("Movie Library")) {
			System.out.println("Successfully Completed...");
		}
	}

}
