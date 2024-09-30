package day4.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Select 'Your most favourite browser' from the radio buttons\n"
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		 // Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected.
		WebElement button = driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
		button.click();
		Boolean option = button.isEnabled();
		if(option==true)
			System.out.println("Button is selected");
		button.click();
		Boolean option1 = button.isSelected();
		if(option1==false)
			System.out.println("Button is not selected");
		// Identify the radio button that is initially selected by default.
		Boolean selected = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).isEnabled();
		if(selected==true)
			System.out.println("Button is selected by default");
		// Check and select the age group (21-40 Years) if not already selected.
		Boolean age = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).isEnabled();
		if(age==true)
			System.out.println("Age is already selected");
		else
			System.out.println("Age is not selected");
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
