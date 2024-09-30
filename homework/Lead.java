package day3.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GS Solutions Limited");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowthami");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nallamothu");
    WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
     title.sendKeys("Manager");
    
    System.out.print("Title :" +title);
    driver.findElement(By.className("smallSubmit")).click();
    String text = driver.getTitle();
    System.out.println("Title of page: " +text);
    Thread.sleep(5000);
	driver.close();
	if(text.contains("View Lead"))
		System.out.println("Page is verified");
	else
		System.out.println("Incorrect title");
}
}
