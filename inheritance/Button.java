package day5.inheritance;

public class Button extends WebElement {
	
	// Button subclass, include a submit() method.
	public void submit()
	{
		System.out.println("Submitted");
	}
	
	public static void main(String[] args) {
	
		Button button = new Button();
		button.click();
		button.submit();
		button.setText("Button");
	}

}
