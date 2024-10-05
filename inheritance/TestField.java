package day5.inheritance;

public class TestField extends WebElement
{
  //TextField subclass, include a getText() method.
	
  public void getText()
  {
	  System.out.print("Get Text");
  }
  public static void main(String[] args) {
	TestField field = new TestField();
	field.click();
	field.setText("TestField");
	field.getText();
}
  
}
