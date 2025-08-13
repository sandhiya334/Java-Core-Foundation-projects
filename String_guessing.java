package while_dowhile;
import java.util.Scanner;
public class String_guessing {
	public static void main(String args[]) {
		try(Scanner input = new Scanner(System.in) ){
			
			String word = "lion";
			String guess = "";
			int guessCount = 0;
			int guessLimit = 5 ;
			boolean outOfGuess = false;
		
			while(!guess.equals(word) && !outOfGuess)  {//		(guess != word)  !=   is not for content  
				if(guessCount < guessLimit) {
				System.out.print("Enter the guessing word : ");
				guess = input.nextLine();				
				guessCount++;
				}
				else {
					outOfGuess=true;
					
				}
			}
			if(outOfGuess) {
				System.out.println("YOU HAVE RUN OUT OF GUESS LIMIT  SORRY....");
			}
			else {
			System.out.println("YOU WIN !! ");
			System.out.println("Number of attemt is  "+guessCount);
		}
			}
	}
}
