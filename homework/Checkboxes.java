package day4.homework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Checkboxes {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//span[text()='Basic']")).click();
        driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
        String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
   
        if(text.equals("Checked"))
        	System.out.println("Both elements are checked");
        else
        	System.out.println("No elements are checked");
        driver.findElement(By.xpath("(//label[text()='Java'])")).click();
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
        String status = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
        if(status.equals("State = 1"))
        	System.out.println("Verified state is 1");
        else
        	System.out.println("Unverified");
        driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
        String status1 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
        if(status1.equals("Checked"))
        	System.out.println("Toggle switch checked");
        else
        	System.out.println("Toggle switch not checked");
      Boolean Enable = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']")).isEnabled();
      System.out.println(Enable);
     List<WebElement> options = driver.findElements(By.xpath("//h5[text()='Select Multiple']"));
     for(int i=0;i<options.size();i++)
     {
    	 options.get(i).click();
     }
    
     Thread.sleep(5000);
     driver.close();
     
      
        
        
		
	}

}
