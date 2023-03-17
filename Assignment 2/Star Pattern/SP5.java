class SP5
{
	public static void main(String args[])
	{
	  for(int r=1;r<=5;r++)
		{  
	        for(int s=4;s>=r;s--)
			{
				System.out.print(" ");
			}
			
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			
			for(int c=2;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
	
	
}
/*

    *
   ***
  *****
 *******
*********

*/