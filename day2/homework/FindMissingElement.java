package day2.homework;

public class FindMissingElement {
	public static void main(String[] args) {
		int a[]={1, 4,3,2,8, 6, 7};
		int temp;
		System.out.print("Sorted array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.print(a[i] +",");
		
		}
		int k=1;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]==k)
				k++;
			else
				{
				System.out.println();
				System.out.println("Missing element:" +k);
				break;
				}
		}		
	}
}
