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
		System.out.println("������ѧ���ɼ���");
		int a=sc.nextInt();
		if(a>=90&&a<=100)
		{
			System.out.println(a+"\t�ɼ�����");
		}
		else if(a>=80&&a<90)
		{
			System.out.println(a+"\t�ɼ�����");
		}
		else if(a>=70&&a<80)
		{
			System.out.println(a+"\t�ɼ��е�");
		}
		else if(a>=60&&a<70)
			System.out.println(a+"\t�ɼ�����");
		else
		{
			System.out.println(a+"\t�ɼ�������");
		}
	}
}