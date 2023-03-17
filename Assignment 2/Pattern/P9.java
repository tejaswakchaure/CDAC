class P9
{
   public static void main(String args[])
   {     int c = 65;
        for(int i=65;i<=70;i++)
		{
		    for(int s=69;s>=i;s--)
			{
			    System.out.print(" ");
			}
			for(int j=65;j<=i;j++)
			{
			    System.out.print((char)j+" ");
			}
			System.out.println(" ");
		}
   }
}
/*

     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F

*/