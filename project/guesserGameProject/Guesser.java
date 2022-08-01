import java.util.Scanner;

public class Guesser {
private int guess_number;
public int guessNumber()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Guesser guess the number");
	guess_number=sc.nextInt();
	return guess_number;
}
}
