package package1;
import java.util.Scanner;
public class MaxExponents 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		int max=0,count=0,maxnum=0,j;
		for(int i=a;i<=b;i++)
		{
			j=i;
			System.out.println(i+","+j);
			while(j!=0 && j%2==0)
			{
					count++;
					System.out.println("count: "+count);
					j=j/2;
					System.out.println("j: "+j);
			}
			if(max<count)
			{
				max=count;
				maxnum=i;
			}
			count=0;
		}
		System.out.println("The no. of max exponent of 2 is: "+maxnum);
	}
}
