public class  fact 
{
	public static void main(String args[])
	{
		int f=1;

		String num;
		num=args[0];

		int no=Integer.parseInt(num);

		for(int i=1; i<=no; i++)
		{
			f=f*i;
		}
		System.out.println("Fact="+f);
	}
}