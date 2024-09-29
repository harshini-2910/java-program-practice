package package1;
import java.util.Scanner;
import java.util.*;
public class SecondLargeSmallSum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7];
		System.out.println("Enter array elements:");
		for(int i=0;i<7;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println("even="+even);
		System.out.println("odd="+odd);
		System.out.println(odd.get(0));
		System.out.println(odd.get(1));
		System.out.println("The sum="+(even.get(even.size()-2)+odd.get(1)));
	}
}
