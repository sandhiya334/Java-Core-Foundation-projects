
import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {
	
	public static void main(String args[]) {
		try(Scanner input = new Scanner(System.in)){
			Random random = new Random();
			int target = random.nextInt(100) + 1;
			
			int guess = 0;
			int attempt = 0;
			
			while(guess != target) {
				System.out.print("\nEnter the guessing number : ");
				guess = input.nextInt();
				attempt++;
				
				if(guess > target) {
					System.out.println("Your guess is too high ! ");
				}
				else if(guess < target){
					System.out.println("Your guess is too low ! ");
				}
				else {
					System.out.println("You got the answer ! ");
				}
			}
			System.out.println("\nCongras You got the answer in "+attempt+" attempts ");
		}
		
	}
}
