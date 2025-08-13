import java.util.Scanner;

public class sum_factorial{
	public static void main(String arg[]) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("enter the number u need to get the sum of number = ");
			int num = input.nextInt();
			
			int sum = 0;
			int factorial = 1;
			for(int i=1 ; i<=num ; i++) {
				sum =  sum + i ;
				factorial = factorial * i;
			}
System.out.println("the sum of the number "+num+" = "+sum);
System.out.println("the factorial of the number "+num+" = "+factorial);
		}
	}
	
}
