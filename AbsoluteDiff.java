package package1;
import java.util.Scanner;
public class AbsoluteDiff 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		int num=13, diff=2;
		int count=0;
		System.out.println("Enter the array values:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element="+arr[i]);
			System.out.println("num="+num);
			System.out.println("diff="+diff);
			System.out.println("abs value="+Math.abs(arr[i]-num));
			if(Math.abs(arr[i]-num)<diff)
				count++;
		}
		System.out.println("no. of elements="+count);
	}
}
