package day4.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGround {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//Verify that the title of the page is ‘dashboard.’
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard"))
			System.out.println("Title of the page is dashboard");
		else
			System.out.println("Title of the page is not dashboard");
		driver.navigate().back();
		// Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement option = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']"));
		Boolean button = option.isEnabled();
		if(button==false)
			System.out.println("Button is disabled");
		// Find and print the position of the button with the text ‘Submit.’
        WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
        Point location = position.getLocation();
        System.out.println("Location of button" +location);
		// Find and print the background color of the button with the text ‘Find the Save button color.’
        WebElement color = driver.findElement(By.xpath("//span[text()='Save']"));
        String backgroundColor = color.getCssValue("background-color");
        System.out.println("Background color of the button:" +backgroundColor);
        // Find and print the height and width of the button with the text ‘Find the height and width of this button.’
        WebElement heightWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
        int height = heightWidth.getSize().getHeight();
        int width = heightWidth.getSize().getHeight();
	    System.out.println("Height and Width of button:" +height +"," +width );
	    // Close the browser window.
	    driver.close();
		
		
	}

}
