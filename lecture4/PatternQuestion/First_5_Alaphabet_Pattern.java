
public class First_5_Alaphabet_Pattern {

	public static void main(String[] args) {
		System.out.println("First 5 Alphabets of English");
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			   if((i==1&&j!=1&&j!=n)||(i!=1&&(j==1||j==n))||i==n/2+1)
				   System.out.print("* ");
			   else
				   System.out.print("  ");
			}
			for(int j=1;j<=n-1;j++)
			{
				if(j==1||i==1&&j!=n-1||j==n-1&&i!=1&&i!=n/2+1&&i!=n||i==n/2+1&&j!=n-1||i==n&&j!=n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			for(int j=1;j<=n-1;j++)
			{
				if(i==1&&j!=1||j==1&&i!=1&&i!=n||i==n&&j!=1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=n-1;j++)
			{if(j==1||i==1&&j!=n-1||j==n-1&&i!=1&&i!=n||i==n&&j!=n-1)
				System.out.print("* ");
			else 
				System.out.print("  ");
				
			}
			for(int j=1;j<=n-1;j++)
			{if(j==1||i==1||i==n/2+1||i==n)
				System.out.print("* ");
			else 
				System.out.print("  ");
				
			}
			System.out.println();
		}
		

	}

}
