class SP14
{  
    public static void main(String args[])
	{ 
	    for(int r=1;r<=4;r++)
		{
		    for(int s=1;s<=r;s++)
			{
			    System.out.print(" ");
			}
			for(int c=5;c>=r;c--)
			{ 
			    System.out.print("* ");
			}
			System.out.println(" ");
		}
		 for(int r=1;r<=5;r++)
		{
		    for(int s=5;s>=r;s--)
			{
			    System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{ 
			    System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
/*

 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
 
 */