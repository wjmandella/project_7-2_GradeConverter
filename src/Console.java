import java.util.Scanner;

public class Console {
    
	public Console() {
		
	}
	
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }  
    
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than or equal to " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than or equal to" + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

	public static String askToContinue(Scanner sc) {
		String choice = "";
		boolean isValid = false;

		while (!isValid) {
			choice = "";
			System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			if (choice.equals("")) {
				System.out.println("Error! This entry is required. Try againd.");
			} else if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")) {
				System.out.println("Error! Entry must be \"y\" or \"n\".");
			} else {
				isValid = true;
			}
		}
		return choice;
	}

//    public static double getDouble(String prompt) {
//        double d = 0;
//        boolean isValid = false;
//        while (!isValid) {
//            System.out.print(prompt);
//            if (sc.hasNextDouble()) {
//                d = sc.nextDouble();
//                isValid = true;
//            } else {
//                System.out.println("Error! Invalid number. Try again.");
//            }
//            sc.nextLine();  // discard any other data entered on the line
//        }
//        return d;
//    }
//
//    public static double getDouble(String prompt, double min, double max) {
//        double d = 0;
//        boolean isValid = false;
//        while (!isValid) {
//            d = getDouble(prompt);
//            if (d <= min) {
//                System.out.println(
//                        "Error! Number must be greater than " + min + ".");
//            } else if (d >= max) {
//                System.out.println(
//                        "Error! Number must be less than " + max + ".");
//            } else {
//                isValid = true;
//            }
//        }
//        return d;
//    }
}
