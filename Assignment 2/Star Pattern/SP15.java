class SP15
{
    public static void main (String args[])
	{
	    for(int r=1;r<=5;r++)
		{
		    for(int c=1;c<=5;c++)
			{
			    if(r==c || (r==5)  || (c==1))
				{
				    System.out.print("*");
				}
				else
				{
				    System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}



/*class SP15
{
    public static void main(String args[])
	{
	    for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=i;j++)			
			{
				if(j==5 || i==5||i==1||j==1||i==j)
				{
			    System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
		System.out.println(" ");
		}
		
	
	}
}*/