package HomeWork02;
import java.util.Scanner;
public class HomeWork02
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("输入2次方的系数");
	int a=sc.nextInt();
	System.out.println("输入1次方的系数");
	int b=sc.nextInt();
	System.out.println("输入0次方的系数");
	int c=sc.nextInt();
	if((b*b-4*a*c)<0){
	  System.out.println("方程无解");
	  return;
	}
	else{
	  System.out.println("方程有解");
	}
	double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
	double x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
	System.out.println("根分别是"+x1+"\t"+x2);
	}
}