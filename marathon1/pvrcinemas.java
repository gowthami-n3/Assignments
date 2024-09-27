package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class pvrcinemas {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX Laila Mall, M.G Road Vijayawada']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='MATHU VADALARA 2'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'3:00 PM')]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
   
        driver.findElement(By.xpath("//span[@id='CL.CLUB|L:10']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
        String seat = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
        
       System.out.println("Seat details:" +seat);
      String amount = driver.findElement(By.xpath("(//span[text()='201.78'])[2]")).getText();
      System.out.println("Amount : " +amount);
      driver.findElement(By.xpath("//button[text()='Proceed']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
      String title = driver.getTitle();
      System.out.println("Title:" +title);
      Thread.sleep(5000);
      driver.close();
	
      
      
        
		
		
		
		
		
		
		
		
			
	}

}
