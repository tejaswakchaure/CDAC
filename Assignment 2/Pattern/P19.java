class P19
{
    public static void main(String args[])
	{
	    for(int i=65;i<=69;i++)
		{
		    for(int j=69;j>=i;j--)			
			{
			    System.out.print((char)j+" ");
			}
		System.out.println(" ");
		}
	
	}
}
/*

E D C B A
E D C B
E D C
E D
E

*/