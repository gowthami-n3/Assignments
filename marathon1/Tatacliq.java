package marathon;

import java.time.Duration;
import java.util.*;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		    // Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// MouseHover on 'Brands'
		Actions act = new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(brand).perform();	
		// MouseHover on 'Watches & Accessories'
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Watches')]"))).perform();
			// Choose the first option from the 'Featured brands'.
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
			// Select sortby: New Arrivals
		WebElement filter = driver.findElement(By.xpath("//select[@label='Popularity']"));
		Select sort = new Select(filter);
		sort.selectByValue("price-asc");
		Thread.sleep(2000);
		// choose men from catagories filter.
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
			// print all price of watches
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		System.out.println("Price of watches:");
		Thread.sleep(2000);
		for(int i=0;i<price.size()-1;i++)
		{
			String prices = price.get(i).getText();
			System.out.println(prices);
		}
		String initialPrice = price.get(0).getText();
		System.out.println("Initial Price : " +initialPrice);
			// click on the first resulting watch
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		// click Add to Bag   and  get count from the Bag cart icon.
		Set<String> allWindows = driver.getWindowHandles();
		List<String> childWindow = new ArrayList<String>(allWindows);
		driver.switchTo().window(childWindow.get(1));
		driver.findElement(By.xpath("(//span[@data-test='button'])[3]")).click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
		String items = cart.getText();
		cart.click();
		
		System.out.println("No of items added in the cart:" +items);
		// compare two price are similar
		String total = driver.findElement(By.xpath("//div[@class='DesktopCheckout__info DesktopCheckout__label']")).getText();
		System.out.println("Total Price : " +total);
		String finalprice = total.replaceAll("[0^.]", "");
		System.out.println("Final price:"+finalprice);
		if(finalprice.contains(initialPrice))
			System.out.println("Same Price");
		else
			System.out.println("Not Same Price");
		
		// Click on the Bag cart icon
		
		driver.findElement(By.xpath("//span[text()='Checkout']")).click();	
		// Take a snap of the resulting page.	
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/tatacliq.png");
		FileUtils.copyFile(source, destination);
			
	   // Close All the opened windows one by one.
		driver.close();
		driver.switchTo().window(childWindow.get(0));
		driver.close();
	
			
	}

}