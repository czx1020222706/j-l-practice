package HomeWork02;
import java.util.Scanner;
public class HomeWork02
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("����2�η���ϵ��");
	int a=sc.nextInt();
	System.out.println("����1�η���ϵ��");
	int b=sc.nextInt();
	System.out.println("����0�η���ϵ��");
	int c=sc.nextInt();
	if((b*b-4*a*c)<0){
	  System.out.println("�����޽�");
	  return;
	}
	else{
	  System.out.println("�����н�");
	}
	double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
	double x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
	System.out.println("���ֱ���"+x1+"\t"+x2);
	}
}