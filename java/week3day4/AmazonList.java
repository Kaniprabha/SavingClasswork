package week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {
	
	
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("phones");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    List<WebElement> phonePrice =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
	    
	    List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<phonePrice.size(); i++) {
        	String text = phonePrice.get(i).getText();
        	String replace = text.replaceAll(",", "").replaceAll("a^,1", "");
        	if(!replace.isEmpty()) {
        		list.add(Integer.parseInt(replace));
        	}        	        	
        	//System.out.println(priceValues.getText());
        }        
		
		Collections.sort(list);       
		System.out.println("Mobile Prices: "+ list);
        
       System.out.println("The Lowest Mobile Price: "+ list.get(0));
        
	}

}
