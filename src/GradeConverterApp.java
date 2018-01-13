import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user

            int numericalGrade = Console.getInt("Enter numerical grade: ", 0, 100);   
            
            Grade g = new Grade(numericalGrade);
            
            System.out.println("Letter grade: " + g.determineLetterGrade());
            
            choice = Console.askToContinue(sc);
            System.out.println();
        }
		
        System.out.println("Bye!");
	}

}
