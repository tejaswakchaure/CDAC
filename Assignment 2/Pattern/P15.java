class P15
{
    public static void main(String args[])
	{
		// row
	    for(int i=1;i<=5;i++)
		{
			//colom 
		    for(int j=5;j>=i;j--)			
			{
				
			    System.out.print(j+" ");
			}
		System.out.println(" ");
		}
	
	}
}
/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/