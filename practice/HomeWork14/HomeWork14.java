package HomeWork14;
public class HomeWork14
{
	public static boolean isyinzi(int num)
	{
		int sum=0;
		for(int d=num-1;d>=1;d--)
		{
			if(num%d==0)
			{
				sum+=d;
			}
		}
		return sum==num;
	}
	public static void main(String[] args)
	{
		for(int a=1;a<=1000;a++)
		{
			int num=a;
			if(isyinzi(num))
			{
				System.out.println(num);
			}
		}
	}
}