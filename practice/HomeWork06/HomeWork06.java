package HomeWork06;
import java.util.Scanner;
public class HomeWork06
{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个0~99999之间的任意数：");
		int number=sc.nextInt();
		if(number/10000>=1&&number/10000<10){
		System.out.println("五位");
			}
		else if(number/1000>=1){
		System.out.println(number+"\t是四位");
			}
		else if(number/100>=1){
		System.out.println("三位");
			}
		else if(number/10>=1){
		System.out.println("两位");
			}
		else if(number/1>=1){
		System.out.println("一位");
			}
	}
}