package HomeWork05;
import java.util.Scanner;
public class HomeWork05
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("��");
		int year=sc.nextInt();
		System.out.println("��");
		int month=sc.nextInt();
		System.out.println("��");
		int day=sc.nextInt();
		int days=0;
		switch(month)
		{
			case 12:days+=30;
			case 11:days=days+31;
			case 10:days+=30;
			case 9:days=days+31;
			case 8:days+=31;
			case 7:days=days+30;
			case 6:days+=31;
			case 5:days=days+30;
			case 4:days+=31;
			case 3:
				if((year%4==0&&year%100!=0)||(year%400==0))
			{
				days+=29;
			}
			else
			{
				days+=28;
			}
			case 2:days+=31;
			case 1:days+=day;
		}
			System.out.println("��"+days+"��");

	}
}