import java.util.Scanner;

public class loop
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		if(1<=N&&100>=N)
		{
			for(int i=1;i<=N;i++)
			{
				System.out.println(i+" Abracadabra");
			}
		}
	}
}