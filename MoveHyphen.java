package package1;
import java.util.Scanner;
public class MoveHyphen 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		char[] ch=str.toCharArray();
		String hy="";
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='-')
				hy=ch[i]+hy;
			else
				hy=hy+ch[i];
		}
		System.out.println("Hyphen: "+hy);
	}
}
