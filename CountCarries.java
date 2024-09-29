package package1;
import java.util.Scanner;
public class CountCarries 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 num: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("the no. of carries="+(countcarry(num1,num2)));
	}
	public static int countcarry(int n1,int n2)
	{
		int carry=0,d1,d2,rem=0,sum;
		int temp1=n1;
		int temp2=n2;
		while(temp1>0 || temp2>0)
		{
			d1=temp1%10;
			d2=temp2%10;
			if((d1+d2+rem)>9)
			{
				carry++;
				sum=d1+d2+rem;
				sum=sum/10;
				rem=sum;
			}
			temp1=temp1/10;
			temp2=temp2/10;
		}
		while(temp1>0)
		{
			d1=temp1%10;
			if((d1+rem)>9)
			{
				carry++;
				sum=rem+d1;
				sum=sum/10;
				rem=sum;
			}
			temp1=temp1/10;
		}
		while(temp2>0)
		{
			d2=temp2%10;
			if((d2+rem)>9)
			{
				carry++;
				sum=rem+d2;
				sum=sum/10;
				rem=sum;
			}
			temp2=temp2/10;
		}
		return carry;
	}
}
