import java.util.Scanner;

public class QuizeImplementation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuizControler qc = new QuizControler();
		System.out.println("\n--------------------------------------------------");
		System.out.println("*********************Java Quiz********************");
		System.out.println("--------------------------------------------------");
		String name = getStringInput(sc, "Enter your name:\t");
		String phoneNum = getStringInput(sc, "Enter your phone Number:\t");
		String collegeName = getStringInput(sc, "Enter your college Name:\t");
		String profession = getStringInput(sc, "Enter your Profession:\t");
		qc.getUserDetails(name, phoneNum, collegeName, profession);
		String ready = getStringInput(sc, "Are you ready for the quiz:\t(y/n):");
		if (ready.charAt(0) == 'y' || ready.charAt(0) == 'Y') {
			qc.startQuiz(sc);
			System.out.println("Quiz Completed...!!");
			System.out.println("--------------------------------------------------");
			System.out.println("Be Careful ! Wrong input can destroy your proccess..");
			System.out.println("--------------------------------------------------");
			sc.nextLine();
			String result = getStringInput(sc, "Press 1 to get Result:-->\t");
			System.out.println("\n--------------------------------------------------");
			if (result.charAt(0) == '1') {
				qc.getResult();
			} else {
				System.exit(0);
				outro();
			}
		} else {
			outro();
		}
	}

	private static void outro() {
		System.out.println("--------------------------------------------------");
		System.out.println("Program closed ! Thank you !");
		System.out.println("--------------------------------------------------");
	}

	private static String getStringInput(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
}
