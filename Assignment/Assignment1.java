
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 obj1=new Solution1();
		System.out.println("Solution:1\n");
		obj1.show();
		System.out.println("\nSolution:2\n");
		Solution2 obj2=new Solution2();
		obj2.show();
		System.out.println("\nSolution:3\n");
		Solution3 obj3=new Solution3();
		obj3.show();
		System.out.println("\nSolution:4\n");
		Solution4 obj4=new Solution4();
		obj4.show();
		System.out.println("\nSolution:5\n");
		Solution5 obj5=new Solution5();
		obj5.show();
	}

}


class Solution1 {
 
void show() {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
			if(i==1||j==n/2+1||i==n)
				System.out.print("*");
			else 
				System.out.print(" ");
		
		System.out.print(" ");
		
		for(int j=1;j<=n;j++)
			if(j==1||i==j||j==n)
				System.out.print("*");
			else
				System.out.print(" ");
		
		System.out.print(" "); 
		
		for(int j=1;j<=n;j++)
			if(j==1||i==1||i==n/2+1||i==n)
				System.out.print("*");
			else
				System.out.print(" ");
				
		System.out.print(" ");		
		
		for(int j=1;j<=n;j++)
			if(j==1&&i!=n||j==n&&i!=n||i==n&&j!=1&&j!=n)
				System.out.print("*");
			else
				System.out.print(" ");
		
		System.out.print(" ");
		
		for(int j=1;j<=n;j++)
			if(j==1||i==1&&j!=n||j==n&&i<=n/2+1||i==n/2+1&&j!=n||i==j&&i>n/2+1)
				System.out.print("*");
			else 
				System.out.print(" ");
		System.out.print(" ");
		
		for(int j=1;j<=n;j++)
			if(i==1&&j!=1&&j!=n||i==n&&j!=1&&j!=n||j==1&&i!=1&&i!=n||j==n&&i!=1&&i!=n)
				System.out.print("*");
			else
				System.out.print(" ");
		
		System.out.print(" ");
		
		for(int j=1;j<=n;j++)
			if(j==1||i==j||j==n)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.println();
		
	}
}
}

class Solution2{
	int n=4;
	void show() {
		int k=1;
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
			System.out.print(k);
		System.out.println();
			k++;
		}
	}
}

class Solution3{
	int n=12;
	void show() {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			if(i+j<=n/2+1||i<=j-n/2||j==1||j==n||i==n)
				System.out.print("* ");
			else
				System.out.print("  ");
			System.out.println();
				
			
		}
	}
}

class Solution4{
	int n=12;
	void show()
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				if(i>=j+n/2||i==n||i+j>=(3*n+1)/2+1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			System.out.println();
		}
		for(int i=1;i<=n;i++)
			System.out.print("* ");
		System.out.println();
	}
}

class Solution5{
	int n=12;
	void show() {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			if(i+j<=n/2+2||i>=j+n/2||i==n||i==1)
				System.out.print("* ");
			else
				System.out.print("  ");
			System.out.println();
		}
	}
}