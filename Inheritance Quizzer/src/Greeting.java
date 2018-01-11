import java.util.*;

public class Greeting 
{
	public static int numOfQuestions;
	public static void greetUser()
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("Welcome to the Inheritance Quizzer! \nHow many questions do you want to have?");
		numOfQuestions = userIn.nextInt();
	}
	public static void checkUser()
	{
		Scanner userIn = new Scanner(System.in);
		System.out.println("Are you sure you want " + numOfQuestions + " questions? \n(1) Yes \n(2) No");
		int yOrN = userIn.nextInt();
		if(yOrN == 2)
			greetUser();
		else
			System.out.println("Awesome!");
	}
}
