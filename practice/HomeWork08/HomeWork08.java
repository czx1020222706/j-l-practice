package HomeWork08;
import java.util.Scanner;
public class HomeWork08
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int read=sc.nextln();
		System.out.println("����һ��");
		SteingBulider sb=new StringBulider(String.valueOf(read));
		System.out.println(sb.reverse());
		Stringnstr=read+"";
		char fuzu[]=str.toCharArray();
		String temp="";
		for(int a=fuzu.length-1;a>=0;a--)
		{
			temp=temp=fuzu[a];
		}
		System.out.println("������");
		System.out.println(temp);
	}
}