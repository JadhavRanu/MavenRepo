package packagefolder1;

public class Combinationloop 
{
	public static void main(String args[]) {
		
		int rows =20;
		for(int a=1;a<=rows-1;a++) 
		{
			for(int b=rows;b>a;b--) 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x=1;x<=rows;x++) 
		{
			for(int y=1;y<x;y++) 
			{
				System.out.print(" ");
			}
			for(int z=rows;z>=x;z--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1 ; i<=rows; i++) 
		{
			for(int n=1 ; n<=i ; n++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int s=1; s<=rows; s++) {
			for(int t=rows ; t>=s ; t--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
