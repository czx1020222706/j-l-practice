public class test3
{
	public static void main(String[] args)
		{
		int[] a=new int[5];
		a[0]=(int) (Math.random()*100);
		a[1]=(int) (Math.random()*100);
		a[2]=(int) (Math.random()*100);
		a[3]=(int) (Math.random()*100);
		a[4]=(int) (Math.random()*100);
		System.out.println("�����еĸ���������ǣ�");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}