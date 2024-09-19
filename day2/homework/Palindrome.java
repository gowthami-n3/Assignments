package day2.homework;

public class Palindrome {
	public static void main(String[] args) {
		int input,output;
		int rem;
		output=0;
		input =121;
		int a =input;
		while(input!=0)
		{
			rem = input%10;
			output = (output*10)+rem;
			input = input/10;
			
		}
		System.out.println(output);
		if(a==output)
		System.out.println("Number is palindrome.");
	}

}
