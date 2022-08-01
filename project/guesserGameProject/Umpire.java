 
public class Umpire {
private int guesser_number;
private int player1_number;
private int player2_number;
private int player3_number;

 public void getGuesserNumber(){
	 Guesser guess_obj= new Guesser();
	 guesser_number=guess_obj.guessNumber();
 }
	 
public void getPlayerNumber()
{
	Player play_obj1=new Player();
	Player play_obj2=new Player();
	Player play_obj3=new Player();
	player1_number=play_obj1.guessNumber();
	player2_number=play_obj2.guessNumber();
	player3_number=play_obj3.guessNumber();
	
}
public void compare()
{if(guesser_number==player1_number&&guesser_number==player2_number&&guesser_number==player3_number)
	System.out.println("No Player Win, Please try again 😔😔😔");
else if(guesser_number==player1_number)
	if(player1_number==player2_number)
		System.out.println("Player1 and Player2 Win the game 😀😀😔");
	else if(player1_number==player3_number)
		System.out.println("Player1 and Player3 Win the game 😀😔😀");
	else
		System.out.println("Player1 win the game 😀😔😔");
else if(guesser_number==player2_number)
	if(player2_number==player3_number)
		System.out.println("Player2 and Player3 Win the game 😔😀😀");
	else
		System.out.println("Player2 win the game 😔😀😔");
else if(guesser_number==player3_number)
	System.out.println("Player3 Win the game 😔😔😀");
else
	System.out.println("No one win the game, please try again 😔😔😔");
		
	
}

}
