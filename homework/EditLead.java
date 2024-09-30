package day4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//login to leaftaps
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    //Enter required fields
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("GS Solutions Limited");
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gowthami");
	    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Nallamothu");
	    driver.findElement(By.xpath("(//input[@name='firstNameLocal'])")).sendKeys("Gowthu");
	    driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation");
	    // Enter your email in the E-mail address Field using the locator of your choice.
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gowthami.n333@gmail.com");
	    //Select State/Province as NewYork Using Visible Text.
	    WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    state.click();
	    Select province = new Select(state);
	    province.selectByVisibleText("New York");
	    // Click on the Create Button.
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    //Click on the edit button.
	    driver.findElement(By.linkText("Edit")).click();
	    // Clear the Description Field.
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    // Fill the Important Note Field with Any text.
	    driver.findElement(By.name("importantNote")).sendKeys("Automation");
	    //Click on the update button.
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    //Get the Title of the Resulting Page.
	    String title = driver.getTitle();
	    System.out.println("Title of page:" +title);
	    //Close the browser window.
	    driver.close(); 
	   
  }
}

