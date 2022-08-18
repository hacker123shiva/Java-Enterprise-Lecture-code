
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Solution1");
 A3Solution1 obj1= new A3Solution1();
 obj1.reverse_();
 System.out.println();
 System.out.println("Solution2");
 A3Solution2 obj2= new A3Solution2();
 obj2.reverse_sentence();
 System.out.println();
 System.out.println("Solution3");
 A3Solution3 obj3=new A3Solution3();
 obj3.anagram();
 System.out.println();
 System.out.println("Solution4");
 A3Solution4 obj4=new A3Solution4();
 obj4.panagram(); 
 System.out.println();
 System.out.println("Solution5");
 A3Solution5 obj5=new A3Solution5();
 obj5.countCharcter();
 System.out.println();
 System.out.println("Solution6");
 A3Solution6 obj6=new A3Solution6();
 obj6.sortString();
 System.out.println();
 System.out.println("Solution7");
 A3Solution7 obj7=new A3Solution7();
 obj7.countVowelsConstants();
 System.out.println();
 System.out.println("Solution8");
 A3Solution8 obj8=new A3Solution8();
 obj8.countSpecialCharcter();
	}

}

class A3Solution1{
	public void reverse_() {
		 {
		String str="iNeuron";
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
			str1=str1+str.charAt(i);
		System.out.println(str1);
			}
	}
}

class A3Solution2{
	public void reverse_sentence() {
		String str="Think Twice";
	    String[] arr;
		arr=str.split(" ");
		String str1="";
		for(int i=0;i<arr.length;i++)
		for(int j=arr[i].length()-1;j>=0;j--)
		{if(i!=0&&j==arr[i].length()-1)
			str1=str1+" "+arr[i].charAt(j);
		else
			str1=str1+arr[i].charAt(j);
		}
 

		System.out.println(str1);
	}
}

class A3Solution3{
	public void anagram() {
		String str1="SILENT";
		String str2="LISTEN";
		char ch;
		
		int flag =0;
		int n='U';
		int arr1 []=new int['U'];
		int arr2 []=new int['U'];
		 
		for(int i=0;i<str1.length();i++)
			{
			ch= str1.charAt(i);
			arr1[ch]++;}
		for(int i=0;i<str2.length();i++)
		{ch= str2.charAt(i);
		arr2[ch]++;}
		
		if(str1.length()!=str2.length())
			System.out.println("Not a Anagram");
		else 
		{
			for(int i=0;i<arr1.length;i++)
				if(arr1[i]!=arr2[i])
					{flag=1;
			        break;}
			if(flag!=0)
				System.out.println("Not a Anagram");
			else
				System.out.println("Given strings are Anagram");
			
		}
		
	}
}

class A3Solution4{
	public void panagram()
	{boolean arr[]=new boolean[26];
	int index;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++)
		{if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{index=str.charAt(i)-'A';
			arr[index]=true;
			}
			
		else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{index=str.charAt(i)-'a';
			arr[index]=true;
			}
		}
	for(int i=0;i<26;i++)
		if(arr[i]==false)
			{flag=1;
			break;
			}
		if(flag==1)
			System.out.println("Given string in not panagram");
		else
			System.out.println("Given string is panagram");
	}
	
}

class A3Solution5{
	public void countCharcter() {
		//we are storing all charcter as its ascii value in array
		int arr[]=new int[128];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
			arr[str.charAt(i)]++;
		for(int i=0;i<128;i++)
			System.out.println((char)i+ ":"+ arr[i]);
	}
}

class A3Solution6{
	Scanner sc=new Scanner(System.in);
	 
	public void sortString() {
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int n=str.length();
		char buf[];
		buf=str.toCharArray();
		Arrays.sort(buf);
		str=new String(buf);
		System.out.println(str);
		
	}
}

class A3Solution7{
	Scanner sc =new Scanner(System.in);
	public void countVowelsConstants() {
		int vow=0;
		int cons = 0;
		System.out.println("Enter a string");
		String str =sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				vow++;
			else
				cons++;
				
		}
		System.out.println("Vowels : "+vow+"\nConstants : "+cons);
	}
}

class A3Solution8{
	Scanner sc= new Scanner(System.in);
	public void countSpecialCharcter() {
		int spe=0;
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
			if ((str.charAt(i)<'A'||str.charAt(i)>'Z')&&(str.charAt(i)<'a'||str.charAt(i)>'z')&&(str.charAt(i)<'0'||str.charAt(i)>'9'))
				spe++;
		System.out.println("Special Cahracter: "+spe);
	}
}