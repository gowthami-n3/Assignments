package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class servicenow {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://dev188588.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Launch ServiceNow application
		//Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("7qK!wLpUiU%6");
		driver.findElement(By.id("sysverb_login")).click();
		//Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement All = (WebElement)js.executeScript("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"#d6e462a5c3533010cbd77096e940dd8c\")");
		All.click();
		Thread.sleep(2000);
		
		WebElement catalog = (WebElement)js.executeScript("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"div > sn-canvas-appshell-root > sn-canvas-appshell-layout > sn-polaris-layout\").shadowRoot.querySelector(\"div.sn-polaris-layout.polaris-enabled > div.layout-main > div.header-bar > sn-polaris-header\").shadowRoot.querySelector(\"nav > div > div.starting-header-zone > sn-polaris-menu:nth-child(2)\").shadowRoot.querySelector(\"nav > div.sn-polaris-nav.d6e462a5c3533010cbd77096e940dd8c.can-animate > div.sn-tree-menu.sn-polaris-nav-content > div > div > sn-collapsible-list:nth-child(1)\").shadowRoot.querySelector(\"#e660172ac611227b00fa88fb47ae3fad > span > span.label\")");
		catalog.click();	

		
		//Click on  mobiles
		WebElement moblies = (WebElement)js.executeScript("return document.querySelector(\"body > macroponent-f51912f4c700201072b211d4d8c26010\").shadowRoot.querySelector(\"#gsft_main\")");
		driver.switchTo().frame(moblies);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);
		
		//Select Apple iphone13pro
		driver.findElement(By.xpath("(//strong[contains(text(),'Apple')])[2]")).click();
		// Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("9808230882");
		// Select Unlimited from the dropdown in Monthly data allowance
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select option = new Select(dropdown);
		option.selectByValue("unlimited");
		// Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
	    // Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		// Verify order is placed and copy the request number
		String verify = driver.findElement(By.xpath("//div[@class='order_summary']/div/span[2]")).getText();
		System.out.println(verify);
		String req = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(req);
		//Take a Snapshot of order placed page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/servicenow.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		
		
		
		
	}

}
