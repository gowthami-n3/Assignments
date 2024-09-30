package day3.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(), 'account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sarika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9087234121");
		driver.findElement(By.id("password_step_input")).sendKeys("Rika123$4");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
		dropdown.click();
		Select day = new Select(dropdown);
		day.selectByValue("4");
	    WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
		dropdown1.click();
		Select month = new Select(dropdown1);
		month.selectByVisibleText("Mar");
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='year']"));
		dropdown3.click();
		Select year = new Select(dropdown3);
		year.selectByValue("1995");
		driver.findElement(By.xpath("//input[@id='sex'][1]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
	}

}
