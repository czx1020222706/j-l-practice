package HomeWork10;
public class HomeWork10
{
	public static void main(String[] args)
	{
		int num=200;
		while(num<=500)
		{
			boolean tag=true;
			for(int d=2;d<=num-1;d++)
			{
				if(num%d==0)
				{
					tag=false;
					break;
				}
			}
			if(tag)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}