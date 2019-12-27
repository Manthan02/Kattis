import java.util.Scanner;

public class Quadrant
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		if(N1>=-1000&&N1<=1000&&N2>=-1000&&N2<=1000)
		{
			if(N1>0)
			{
				if(N2>0)
				{
					System.out.println(1);
				}
				else
				{
					System.out.println(4);
				}
			}
			else
			{
				if(N2>0)
				{
					System.out.println(2);
				}
				else
				{
					System.out.println(3);
				}
			}
		}
	}
}