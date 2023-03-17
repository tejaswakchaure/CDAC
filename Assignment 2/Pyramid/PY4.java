class PY4
{
    public static void main(String args[])
	{
	    for(int i=1;i<=9;i++)
		{
			for(int s=8;s>=i;s--)
			{
				System.out.print("  ");
			}
			
		    for(int j=1;j<=i;j++)
			{
			     System.out.print(" "+j);
			}
			//System.out.println(" ");
		
			for(int k=i-1;k>=1;k--)
			{
			    System.out.print( " "+k+"");
			}
			System.out.println(" ");
		
	    }
		
		
		
	}
}


      