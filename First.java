package package1;
import java.util.Scanner;

public class First 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		int p=productSmallestPair(sum,arr);
		System.out.println("The product="+p);
	}
	public static int productSmallestPair(int sum, int[] arr)
	{
		int min=arr[1];
		int min2=min;
		if(arr.length<2)
			return -1;
		for(int num:arr) 
		{
			if(num<min)	
			{
				min2=min;
				min=num;
			}
			else if(num<min2 &&num!=min)
				min2=num;
		}
		System.out.println("min="+min);
		System.out.println("min2="+min2);
		if(min+min2<=sum)
			return min*min2;
		return 0;
	}
}
