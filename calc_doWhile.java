package while_dowhile;
import java.util.Scanner;

public class calc_doWhile {
	public static void main(String args[]) {
		try(Scanner input = new Scanner(System.in)) {
		char choice ;
		
		do{
			System.out.print("\nENTER NUMBER 1 : ");
			Double num1 = input.nextDouble();
			
			System.out.print("\nENTER NUMBER 2 : ");
			Double num2 = input.nextDouble();
			
			System.out.print("\nWHAT OPERATION YOU NEED TO DO (+ , - , * , / ) : ");
			char operator = input.next().charAt(0);
			
			System.out.println("\nSOLUTION : ");
			double result ; 
			
			switch(operator) {
				case '+' :
					result = num1 + num2;
					System.out.println(num1+ " + "+num2+" = "+result);
					break;
				case '-':
					result = num1 - num2;
					System.out.println(num1+" - "+num2+ " = "+result);
					break;
				case '*' :
					result = num1 * num2;
					System.out.println(num1+" * "+num2+ " = "+result);
					break;
				case '/' :
					if(num2 != 0) {
						result = num1 / num2;
						System.out.println(num1+" / "+num2+ " = "+result);
					}
					else {
						System.out.println("WE CAN'T DIVIDE A NUMBER WITH '0' ZERO ");
					}
					break;
				default :
					System.out.println("Enter the correct input numbers ");
				
					
			}
			System.out.print("\nDo you want to perform another calculation? (y/n): ");
            choice = input.next().charAt(0);
		}
		while(choice == 'y' || choice == 'Y');
		 System.out.println("Calculator exited.");
	     input.close();
	}
}
}