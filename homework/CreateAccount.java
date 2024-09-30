package day3.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Gowthami");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    WebElement dropDown = driver.findElement(By.name("industryEnumId"));
	    dropDown.click();
	    Select industry = new Select(dropDown);
	    industry.selectByIndex(3);
	    WebElement dropDown1 = driver.findElement(By.name("ownershipEnumId"));
	    dropDown1.click();
	    Select ownership = new Select(dropDown1);
	    ownership.selectByVisibleText("S-Corporation");
	    WebElement dropdown2 = driver.findElement(By.id("dataSourceId"));
	    dropdown2.click();
	    Select source = new Select(dropdown2);
	    source.selectByValue("LEAD_EMPLOYEE");
	    WebElement dropdown3 = driver.findElement(By.id("marketingCampaignId"));
	    dropdown3.click();
	    Select marketing = new Select(dropdown3);
	    marketing.selectByIndex(6);
	    WebElement dropdown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	    dropdown4.click();
	    Select state = new Select(dropdown4);
	    state.selectByValue("TX");
	    driver.findElement(By.className("smallSubmit")).click();
	    String name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
	    if(name.contains("Gowthami"))
	    	System.out.println("Account name is displayed correctly");
	    else
	    	System.out.println("Incoorect details");
	    Thread.sleep(5000);
	    driver.close();
	}
}

	    
	    
	    		
	    	