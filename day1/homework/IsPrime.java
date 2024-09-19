package day1.homework;

public class IsPrime {
	public static void main(String[] args) {
		int n=7;
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}		

}
