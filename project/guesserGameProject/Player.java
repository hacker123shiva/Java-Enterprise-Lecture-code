import java.util.Scanner;

public class Player {
private int guess_number;
public int guessNumber()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Player guess the number range between 0 to 10");
	guess_number=sc.nextInt();
	return guess_number;
}
}
