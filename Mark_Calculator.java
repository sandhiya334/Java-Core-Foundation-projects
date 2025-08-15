

import java.util.Scanner;

public class Mark_Calculator {
	public static void main(String args[]) {
		try (Scanner gr = new Scanner(System.in)) {

			System.out.println("\t \t Student mark calculator ");
			char choice=0;
			do {
				System.out.print("\nStudent name : ");
				String StudentName = gr.nextLine();
				
				System.out.print("Student Class : ");
				String StudentClass = gr.nextLine();
				
				System.out.print("\n How many Subject are there to calculate ? ");
				int totalSubject = gr.nextInt();
				int[] marks = new int[totalSubject];
				
				int totalM = 100 * totalSubject ;
				int total = 0;
				
				System.out.println();
				// subject total
				for (int i = 0; i < totalSubject; i++) {
					System.out.print("Enter the mark for subject " + (i + 1) + " : ");
					marks[i] = gr.nextInt();
					total += marks[i];

				}

				// subject average
				double average = total / totalSubject;

				// Grade for the Student

				char grade = 0;
				if (average >= 90) {
					grade = 'A';
				} else if (average >= 80) {
					grade = 'B';
				} else if (average >= 65) {
					grade = 'C';
				} else if (average >= 50) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				
				System.out.print("\nNAME 			: "+StudentName);
				System.out.print("\nStandard		: "+StudentClass);
				System.out.print("\nTotal Subject		: "+totalSubject);
				System.out.print("\nTotal Mark Scored 	: "+total+" / "+totalM);
				System.out.print("\nAverage Score        	: "+average);
				System.out.print("\nGrade Got            	:" + grade);
				System.out.print("\n \nDo you want to perform another calculation? (y/n): ");
	            choice = gr.next().charAt(0);
			}
			while (choice == 'y' || choice == 'Y');
			System.out.println("Grade Calculation exited.");
			gr.close();
		}

	}

}
