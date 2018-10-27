package HomeWork08;
import java.util.Scanner;
public class HomeWork08
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int read=sc.nextln();
		System.out.println("方法一：");
		SteingBulider sb=new StringBulider(String.valueOf(read));
		System.out.println(sb.reverse());
		Stringnstr=read+"";
		char fuzu[]=str.toCharArray();
		String temp="";
		for(int a=fuzu.length-1;a>=0;a--)
		{
			temp=temp=fuzu[a];
		}
		System.out.println("方法二");
		System.out.println(temp);
	}
}