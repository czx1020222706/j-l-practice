package HomeWork06;
import java.util.Scanner;
public class HomeWork06
{
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��0~99999֮�����������");
		int number=sc.nextInt();
		if(number/10000>=1&&number/10000<10){
		System.out.println("��λ");
			}
		else if(number/1000>=1){
		System.out.println(number+"\t����λ");
			}
		else if(number/100>=1){
		System.out.println("��λ");
			}
		else if(number/10>=1){
		System.out.println("��λ");
			}
		else if(number/1>=1){
		System.out.println("һλ");
			}
	}
}