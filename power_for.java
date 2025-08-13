package forLoops;
import java.util.Scanner;

public class power_for {
	public static void main(String arg[]) {
		try (Scanner input = new Scanner(System.in)){
		int base_num ;
		int power_num ;
		 
		System.out.print("enter the base number : ");
		base_num = input.nextInt();
		
		System.out.print("enter the number to power : ");
		power_num  = input.nextInt();
		
		int result =1;
		
		for (int i=0 ; i< power_num ; i++) {
			result = result * base_num;
		}
		System.out.println("anstwe is : "+result);
		}
		
		}
		
}
 