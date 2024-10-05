package day5.inheritance;

public class WebElement 
{
	
	//Create a base class named WebElement with common methods such as click() and setText(String text).
	
	public void click()
	{
		System.out.println("Webelement is clicked");
	}
	public void setText(String text)
	{
		System.out.println("setText :" +text);
	}

}
