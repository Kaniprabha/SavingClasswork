package week4day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		//driver.executeScript("document.body.style.zoom='0.7'");
		WebElement frameElt = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameElt);
                
        
        WebElement fstElt = driver.findElement(By.xpath("//ol[@id='selectable']//li[1]"));               
        WebElement ThirdElt = driver.findElement(By.xpath("//ol[@id='selectable']//li[3]"));               
        WebElement fifthElt = driver.findElement(By.xpath("//ol[@id='selectable']//li[5]"));               
        WebElement sevElt = driver.findElement(By.xpath("//ol[@id='selectable']//li[7]"));
        
        Actions action = new Actions(driver);
        
        action.keyDown(Keys.CONTROL).click(fstElt).click(ThirdElt).click(fifthElt).click(sevElt).keyUp(Keys.CONTROL).perform();

		
	}

}
