package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		String results = driver.findElement(By.xpath("//span[contains(text(),'40,000')]")).getText();
		System.out.println("Total :" +results);
		driver.findElement(By.xpath("//span[text()='adidas']")).click();
		driver.findElement(By.xpath("(//span[@class='a-list-item']//i)[3]")).click();
		driver.findElement(By.xpath("(//span[@class='a-list-item']//i)[5]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sort')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Arrivals')]")).click();
		driver.findElement(By.xpath("//span[text()='adidas Unisex POWER BACKPACK, One size']")).click();
		String title = driver.findElement(By.id("productTitle")).getText();
		System.out.println("Title:" +title);
		String price = driver.findElement(By.xpath("//span[text()='$58.33'][2]")).getText();
		System.out.println("Price og bag:" +price);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
	
		
		
		}

}
