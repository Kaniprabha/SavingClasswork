package week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoCSR");
		WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
        crmsfa.click();
        driver.findElement(By.linkText("Create Lead")).click();
        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.sendKeys("TestLeaf");
        WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
        Fname.sendKeys("Ragul");
        WebElement Lname = driver.findElement(By.id("createLeadForm_lastName"));
        Lname.sendKeys("Kesav");
        WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select source = new Select(sourceDD);
        source.selectByIndex(4);
        WebElement MarkComDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select MarkCom = new Select(MarkComDD);
        MarkCom.selectByVisibleText("Automobile");
        WebElement OwnershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select Ownership = new Select(OwnershipDD);
        Ownership.selectByValue("OWN_CCORP");
        driver.findElement(By.name("submitButton")).click();
        String title =driver.getTitle();
        System.out.println(title);
        if(title.contains("View Lead")) {
        	System.out.println("Verification Clear.");
        }else {
        	System.out.println("Verification Failed");               
	    }
        driver.close();
	}
}
