
public class HeartPattern {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n-3;i++)
		{for(int j=1;j<=n-3;j++)
			
			if(i==1||j==(n-4)/2+1||i==n-3)
				System.out.print("* ");
			else
				System.out.print("  ");
			
			for(int j=1;j<=n;j++)
				if(i==1&&j!=1&&j!=n/2+1&&j!=n||i==j+1||i+j==(3*n/2-2)||j==n/2+1&&i==2)
					System.out.print("* ");
				else
					System.out.print("  ");
			for(int j=1;j<=n+2;j++)
				if(j==1||i==j||i+j==n+3||j==n+2)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print(" ");
			for(int j=1;j<=n-4;j++)
				if(i==1&&j!=1&&j!=n-4||j==1&&i!=1&&i!=n-3||j==n-4&&i!=1&&i!=n-3||i==n-3&&j!=1&&j!=n-4)
					System.out.print("* ");
				else 
					System.out.print("  ");
			for(int j=1;j<=n+2;j++)
				if(j==1||i==j||i+j==n+3||j==n+2)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
		}

	}

}
