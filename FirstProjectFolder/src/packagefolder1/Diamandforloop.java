package packagefolder1;

public class Diamandforloop 
{
	public static void main(String args[])
	{
		for(int a=1;a<=5;a++) 
		{
			for(int b=5;b>a;b--) 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x=1;x<=5;x++) {
			for(int y=1;y<x;y++) 
			{
				System.out.print(" ");
			}
			for(int z=5;z>=x;z--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
