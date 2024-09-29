package package1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class EvenOddArraySum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);
		System.out.println("even array size: "+even.size());
		System.out.println("odd array size: "+odd.size());
		System.out.println("The sum = "+(even.get(even.size()-2)+odd.get(odd.size()-2)));
	}
}
