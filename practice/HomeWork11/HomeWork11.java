package HomeWork11;
public class HomeWork11
{
	public static void main(String[] args)
	{
		for(int g=0;g<=20;g++)
		{
			for(int m=0;m<=33;m++)
			{
				for(int x=0;x<=100-g-m;x++)
					if(x%3==0&&5*g+m*3+x/3==100&&g+m+x==100)
				{
					System.out.println("����"+g+"ֻĸ��"+m+"ֻС��"+x+"ֻ");
				}
			}
		}
	}
}