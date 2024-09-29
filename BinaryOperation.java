package package1;
import java.util.Scanner;
public class BinaryOperation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		str=str.toUpperCase();
		char[] ch=str.toCharArray();
		int sum=Integer.parseInt(str.substring(0,1));
		System.out.println("sum="+sum);
		for(int i=1;i<str.length();i+=2) 
		{
			System.out.println("i="+i);
			if(ch[i]=='A')
			{
				if(ch[i-1]==1 && ch[i+1]==1)
					sum=1;
				else
					sum=0;
			}
			if(ch[i]=='B')
			{
				if(ch[i-1]==0 && ch[i+1]==0)
					sum=0;
				else
					sum=1;
			}
			if(ch[i]=='C')
			{
				if((ch[i-1]==0 && ch[i+1]==1)||(ch[i-1]==0 && ch[i+1]==1))
					sum=1;
				else
					sum=0;
			}	
		}
		System.out.println("Result="+sum);
	}
}
