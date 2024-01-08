import java.util.Scanner;

public class QuizeImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuizControler qc = new QuizControler(); //object of the QuizControler class to use their methods 
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("*********************Java Quiz********************");
		System.out.println("--------------------------------------------------");
		
		String name = getStringInput(sc, "Enter your name:\t");
		String phoneNum = getStringInput(sc, "Enter your phone Number:\t");
		String collegeName = getStringInput(sc, "Enter your college Name:\t");
		String profession = getStringInput(sc, "Enter your Profession:\t");
		
		qc.getUserDetails(name, phoneNum, collegeName, profession); //to store the user's data
		String ready = getStringInput(sc, "Are you ready for the quiz:\t(y/n):");
		
		if (ready.charAt(0) == 'y' || ready.charAt(0) == 'Y') { // it will work only when use enter 'y' or 'Y'
			qc.startQuiz(sc); // method to perform the quiz
			System.out.println("Quiz Completed...!!");
			
			System.out.println("--------------------------------------------------");
			System.out.println("Be Careful ! Wrong input can destroy your proccess..");
			System.out.println("--------------------------------------------------");
			
			sc.nextLine(); // this is use to give a chance to the user afer completing the quiz so that 
			//he/she will have a chance to enter thier choice to  getting result or not | basically it give a line input
			
			String result = getStringInput(sc, "Press 1 to get Result:-->\t");
			System.out.println("\n--------------------------------------------------");
			
			if (result.charAt(0) == '1') {
				qc.getResult(); //this method implements after taking the user's answer of agree to show the result or not
			} else {
				System.exit(0);
				outro();
			}
		} else {
			outro();
		}
	}

	private static void outro() { // this is the method to show the outro of the program where needed 
		System.out.println("--------------------------------------------------");
		System.out.println("Program closed ! Thank you !");
		System.out.println("--------------------------------------------------");
	}

	private static String getStringInput(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
}
