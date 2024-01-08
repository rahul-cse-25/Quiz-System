import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizControler {

	private String userName;
	private String phoneNum;
	private String collegeName;
	private String profession;

	static int correctAns = 0;

	Questions que1 = new Questions("-->Who invented Java Programming?", "a)Guido van Rossum", "b)James Gosling",
			"c)Dennis Ritchie", "d)Bjarne Stroustrup");
	Questions que2 = new Questions("-->Which statement is true about Java?",
			"a)Java is a sequence-dependent programming language", "b)Java is a code dependent programming language",
			"c)Java is a platform-dependent programming language",
			"d)Java is a platform-independent programming language");
	Questions que3 = new Questions("-->Which component is used to compile, debug and execute the java programs?",
			"a)JRE", "b)JIT", "c)JDK", "d)JVM");
	Questions que4 = new Questions("-->Which one of the following is not a Java feature?", "a)Object-oriented",
			"b)Use of pointers", "c)Portable", "d)Dynamic and Extensible");
	Questions que5 = new Questions("-->Which of these cannot be used for a variable name in Java?",
			"a)identifier & keyword", "b)identifier", "c)keyword", "d)none of the mentioned");
	Questions que6 = new Questions("-->What is the extension of java code files?", "a).js", "b).txt", "c).class",
			"d).java");
	Questions que7 = new Questions(
			"-->What will be the output of the following Java code?\n\nclass increment{\n\tpublic static void main(String args[]){\n\t\tint g = 3;\n\t\tSystem.out.print(++g * 8);\n\t}\n}\n",
			"a)32", "b)33", "c)24", "d)25");
	Questions que8 = new Questions("-->Which environment variable is used to set the java path?", "a)MAVEN_Path",
			"b)JavaPATH", "c)JAVA", "d)JAVA_HOME");
	Questions que9 = new Questions("-->What is not the use of “this” keyword in Java?",
			"a)Referring to the instance variable when a local variable has the same name",
			"b)Passing itself to the method of the same class", "c)Passing itself to another method",
			"d)Calling another constructor in constructor chaining");
	Questions que10 = new Questions("-->Which of these are selection statements in Java?", "a)break", "b)continue",
			"c)for()", "d)if()");

	Map<Questions, Character> map = new HashMap<>();

	public QuizControler() {
		map.put(que1, 'b');
		map.put(que2, 'd');
		map.put(que3, 'c');
		map.put(que4, 'b');
		map.put(que5, 'c');
		map.put(que6, 'd');
		map.put(que7, 'a');
		map.put(que8, 'd');
		map.put(que9, 'b');
		map.put(que10, 'd');
	}

	public void getUserDetails(String name, String phoneNum, String collegeName, String profession) {
		this.userName = name;
		this.phoneNum = phoneNum;
		this.collegeName = collegeName;
		this.profession = profession;
	}

	public void startQuiz(Scanner sc) {
		for (Map.Entry<Questions, Character> que : map.entrySet()) {
			System.out.println("--------------------------------------------------");
			System.out.println(que.getKey().getQuestion());
			System.out.println(que.getKey().getOption_a());
			System.out.println(que.getKey().getOption_b());
			System.out.println(que.getKey().getOption_c());
			System.out.println(que.getKey().getOption_d());
			System.out.print("Enter your answer:\t");
			Character ans = sc.next().charAt(0);

			if (ans.equals(que.getValue())) {
				System.out.println("Correct Answer !");
				correctAns++;
			} else {
				System.out.println("Wrong Answer !");
			}
			System.out.println("--------------------------------------------------");
		}

	}

	public void getResult() {
		System.out.println("--------------------------------------------------");
		System.out.println("********************Quiz Result*******************");
		System.out.println("--------------------------------------------------");
		System.out.println(getUserName() + ", here is you result");
		System.out.println("Correct Answers:\t" + correctAns);
		System.out.println("Wrong Answers:\t" + (map.size() - correctAns));
		System.out.println("Total Questions:\t" + map.size());
		double percentage = (correctAns * 100) / map.size();
		System.out.println("Percentage:\t" + percentage + "%");
		boolean flag = false;
		if (percentage >= 80) {
			System.out.println("Excellent Performance !! " + getUserName());
			flag = true;
		} else if (percentage >= 40 && percentage < 80) {
			System.out.println("Average Performance !! " + getUserName());
		} else {
			System.out.println("Poor Performance !! " + getUserName());
		}
		System.out.println("--------------------------------------------------");
		if (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println("Excellent Work, " + getUserName() + "\nNice to know your college Name: "
					+ getCollegeName() + "\nWe will contact on your No.: " + getPhoneNum()
					+ "\nMay you grow in your profession: " + getProfession());
			System.out.println("--------------------------------------------------");
		}
		System.out.println("Have a Good Day !!");
		System.out.println("--------------------------------------------------");

	}

	public String getUserName() {
		return userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getProfession() {
		return profession;
	}

}
