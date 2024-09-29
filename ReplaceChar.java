package package1;
import java.util.Scanner;
public class ReplaceChar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		System.out.println("Enter 2 characters to replace: ");
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		char[] ch=str.toCharArray();
		replaceChar(ch,ch1,ch2);
	}
	public static void replaceChar(char[] ch, char c1, char c2)
	{
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c1)
				res=res+c2;
			else if(ch[i]==c2)
				res=res+c1;
			else
				res=res+ch[i];
		}
		System.out.println("The new str: "+res);
	}
}
