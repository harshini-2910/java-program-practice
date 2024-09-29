package package1;
import java.util.Scanner;
public class RatFoodUnit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r,unit;
		int[] arr= {10,9,4,2,6,4,8,0,2,5,3,1};
		System.out.println("Enter the no. of rats and no. of units for each rat");
		r=sc.nextInt();
		unit=sc.nextInt();
		int house=0, tfood=0;
		int food=r*unit;
		if(arr.length==0)
			house=-1;
		else 
		{
			for(int i=0;i<arr.length;i++)
			{
				tfood=arr[i]+tfood;
				System.out.println("total food="+tfood);
				if(food<=tfood)
					break;
				house++;
			}
		}
		if(food>tfood)
			house=0;
		System.out.println("The total no. of houses to enter="+(house));
	}
}
