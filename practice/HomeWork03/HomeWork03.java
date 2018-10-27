package HomeWork03;
import java.util.Scanner;
public class HomeWork03
	{
		public static void main(String[] args)
		{
			//小写字母的ascll值为97-122
			//大写字母的ascll值为65-90
			System.out.println("请输入一个字母：\n");
			Scanner input=new Scanner(System.in);
			char CHAR=input.next().charAt(0);
			if(CHAR>=97&&CHAR<=122)
			{
				//判断是否是小写字母
				System.err.println("该字母是小写字母");
				CHAR=(char) (CHAR-32);  //如果是小写字母则将其转换成大写字母
				System.err.println("转换之后的大写字母是："+CHAR);
			}
			else
				{System.out.println("该字母不是小写字母！");
			}
		}
}