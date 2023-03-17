class SP6
{ 
    public static void main(String args[])
	{
	    for(int r=1;r<=5;r++)
		{
		    for(int s=1;s<=r;s++)
			{
			    System.out.print(" ");
			}
			for(int c=5;c>=r;c--)
			{
			    System.out.print("*");
			}
			
			
		    for(int j=4;j>=r;j--)			
			{
			    System.out.print("*");
			}
		     System.out.println(" ");
		
        }
	  		
	        
		
		
	}
}

/*

 *********
  *******
   *****
    ***
     *
	 
	 Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
	
	*/