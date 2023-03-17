class P13
{
    public static void main(String args[])
	{ 
	    int n = 65;
	    for(int i=n;i<=69;i++)
		{
		    for(int s=68;s>=i;s--)
			{
			    System.out.print(" ");
			}
			for(int j=n;j<=i;j++)
			{
			    System.out.print((char)i+" ");
			}
			System.out.println(" ");
		}
	}
}

/*

    A
   B B
  C C C
 D D D D
E E E E E

*/