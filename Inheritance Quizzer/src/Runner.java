import java.util.*;

public class Runner 
{
	static ArrayList <Answer> theAnswers = new ArrayList <Answer> ( );
	static int counter;
	public static void main(String[] args) 
	{
		runAll(); 
	}

	private static void runAll() 
	{
		createObjects();
		Greeting.greetUser();
		Greeting.checkUser();
		askQuestions();
		endGame();
		
	}

	private static void askQuestions() 
	{
		for(int i = 0 ; i < Greeting.numOfQuestions ; i ++)
		{
			System.out.println();
			getQuestion();
		}
		
	}

	private static void getQuestion() 
	{
		Scanner userIn = new Scanner (System.in);
		int question = (int)(Math.random() * 11);
		System.out.println(theAnswers.get(question).getInstatiation());
		System.out.println();
		System.out.println("With this instantiation, what would the " + theAnswers.get(question).getMethodCall() + " method call return?");
		System.out.println();
		System.out.println("A) The bird is walking! \nB) The bird is squeeling! \nC) The bird that can fly is choosing to walk, wow! \nD) Wow! the brid is flying, how majestic. \nE) The code will not run.");
		String userAnswer = userIn.nextLine();
		
		if(userAnswer.equals(theAnswers.get(question).getAnswer()))
		{
			System.out.println("Correct!");
			counter++;
		}
	}
	
	private static void createObjects() 
	{
		theAnswers.add(new Answer("Bird x = new Bird();" , "walk();" , "A"));
		theAnswers.add(new Answer("Bird x = new Bird();" , "squeels();" , "B"));
		theAnswers.add(new Answer("Bird x = new Bird();" , "fly();" , "E"));
		theAnswers.add(new Answer("Bird x = new Flying();" , "walk();" , "C"));
		theAnswers.add(new Answer("Bird x = new Flying();" , "squeels();" , "B"));
		theAnswers.add(new Answer("Bird x = new Flying();" , "fly();" , "E"));
		theAnswers.add(new Answer("Flying x = new Flying();" , "walk();" , "C"));
		theAnswers.add(new Answer("Flying x = new Flying();" , "squeels();" , "E"));
		theAnswers.add(new Answer("Flying x = new Flying();" , "fly();" , "D"));
		theAnswers.add(new Answer("Flying x = new Brid();" , "walk();" , "E"));
		theAnswers.add(new Answer("Flying x = new Brid();" , "squeels();" , "E"));
		theAnswers.add(new Answer("Flying x = new Brid();" , "fly();" , "E"));
		
	}
	
	private static void endGame() 
	{
		Scanner userIn= new Scanner(System.in);
		System.out.println("You're done! \nYou got " + counter + " right out of " + Greeting.numOfQuestions + "." );
		System.out.println("Would you like to play again? \n(1) Yes \n(2) No");
		int userSays = userIn.nextInt();
		
		if(userSays == 1)
			runAll();
		else
			System.out.println("Goodbye!");
		
	}
}
