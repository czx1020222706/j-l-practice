public class test4
{
	public static void main(String[]args)
	{
		int a[]=new int[]{199,62,68,82,65,9};
		for(int i=0;i<a.length;i++)
		{System.out.println(a[i]+" ");}
		System.out.println(" ");
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[0]){
				int temp=a[0];
				a[0]=a[i];
				a[i]=temp;
		}
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]+" ");
	}
		System.out.println(" ");
}
}