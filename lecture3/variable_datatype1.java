
public class variable_datatype1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
//float b=5.5;  give error Type mismatch: cannot convert from double to float
//solution 
float b=5.5f;
System.out.println(b);
b=5; //implict typecasting int to float
System.out.println(b);
//a=5.5; error Type mismatch: cannot convert from double to int
a=(int)5.5; //explict typecasting float to int
System.out.println(a);
a=(int)2.4/3; // explict typecasting float to int without typecating give error
System.out.println(a);
b=5/3;
System.out.println(b);

// Why this error occur 
//This error occur because we want to store large size value into small size variable
//a is 4 byte and we want to store 8 byte double type  into integer

	}

}

/*
Static typed programming language C,C++ ,Java
where data type declaration is mandatory

Dynamic typed programming language Javascript, python

*/