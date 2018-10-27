package HomeWork07;
import java.util.Scanner;
public class HomeWork07
{
	public static void main(String[] args)
	{
		HomeWork07 jiejie=new HomeWork07();
			jiejie.chengjie();
	}
	void chengjie()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int a=sc.nextInt();
		if(a>=90&&a<=100)
		{
			System.out.println(a+"\t成绩优秀");
		}
		else if(a>=80&&a<90)
		{
			System.out.println(a+"\t成绩良好");
		}
		else if(a>=70&&a<80)
		{
			System.out.println(a+"\t成绩中等");
		}
		else if(a>=60&&a<70)
			System.out.println(a+"\t成绩及格");
		else
		{
			System.out.println(a+"\t成绩不及格");
		}
	}
}