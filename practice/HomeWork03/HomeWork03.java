package HomeWork03;
import java.util.Scanner;
public class HomeWork03
	{
		public static void main(String[] args)
		{
			//Сд��ĸ��ascllֵΪ97-122
			//��д��ĸ��ascllֵΪ65-90
			System.out.println("������һ����ĸ��\n");
			Scanner input=new Scanner(System.in);
			char CHAR=input.next().charAt(0);
			if(CHAR>=97&&CHAR<=122)
			{
				//�ж��Ƿ���Сд��ĸ
				System.err.println("����ĸ��Сд��ĸ");
				CHAR=(char) (CHAR-32);  //�����Сд��ĸ����ת���ɴ�д��ĸ
				System.err.println("ת��֮��Ĵ�д��ĸ�ǣ�"+CHAR);
			}
			else
				{System.out.println("����ĸ����Сд��ĸ��");
			}
		}
}