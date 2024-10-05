package day5.inheritance;

public class RadioButton extends Button {

	public void selectRadioButton()
	{
		System.out.println("Radio button Selected");
	}
	public static void main(String[] args) {
		RadioButton rb = new RadioButton();
		rb.click();
		rb.selectRadioButton();
		rb.setText("RadioButton");
		rb.submit();
	}
}
