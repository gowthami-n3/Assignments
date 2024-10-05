package day5.inheritance;

public class CheckBoxButton extends Button
{
	public void clickCheckButton()
	{
		System.out.println("CheckBox Button");
	}
    public static void main(String[] args) {
		CheckBoxButton cb = new CheckBoxButton();
		cb.click();
		cb.clickCheckButton();
		cb.setText("CheckBox");
		cb.submit();
	}
}
