package day4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("25692");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    // Capture the lead ID of the first resulting lead.
        String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
	    System.out.println("Lead ID:" +text);
	    // Delete the first lead
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	    driver.findElement(By.linkText("Delete")).click();
	    driver.findElement(By.linkText("Find Leads")).click(); 
	    driver.findElement(By.name("id")).sendKeys("10041");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    String text1 = driver.findElement(By.className("x-paging-info")).getText();
	    System.out.println(text1);
	    
	    driver.close();
	    
	    
	}
}
