package HomeWork04;
import java.util.Scanner;
public class HomeWork04
{
	public static void main(String[] args)
		{
		int a;
		int b;
		int c;
		System.out.println("请输入3个正整数");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a<=0||b<=0||c<=0){
			System.out.println("必须输入3个正整数！");
				}
		if((a+b)>c&&(b+c)>a&&(a+c)>b)
			{
			System.out.println("能构成三角形");

		}
		else
			{
			System.out.println("不能构成三角形");
		}

	}
}