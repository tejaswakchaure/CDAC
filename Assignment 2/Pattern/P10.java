class P10
{
   public static void main(String args[])
   {
	   int n = 69;
        for(int i=n;i>=65;i--)
		{
		    for(int s=65;s<i;s++)
			{
			    System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
			    System.out.print((char)j+" ");
			}
			System.out.println(" ");
		}
   }
}
/*

    E
   D E
  C D E
 B C D E
A B C D E
																
*/																*/