package forLoops;
import java.util.Scanner;

public class Pattens {
	public static void main(String args[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("ENTER THE NUMBER OF ROWS : ");
			 int rows = input.nextInt();
			 
			 for(int i=1 ; i<=rows ; i++) {
				 for(int j=1 ; j<= i ; j++) {
				 System.out.print("*");
			 }
				 System.out.println();
			 }
		}
	}
}
