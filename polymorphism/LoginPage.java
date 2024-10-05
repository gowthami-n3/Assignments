package day5.polymorphism;

// Create a subclass named LoginPage.
public class LoginPage extends BasePage{

		// Override the performCommonTasks() method in the LoginPage class.
	public void performCommonTasks()
	{
		System.out.println("Performed commontasks from loginPage");
	}
		// Demonstrate the concept by creating objects for both classes and calling their methods.
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		BasePage base = new BasePage();
		login.performCommonTasks();
		base.performCommonTasks();
		login.clickElement();
		base.clickElement();
		login.findElement();
		base.findElement();
		login.enterText();
		base.enterText();
	}

}
