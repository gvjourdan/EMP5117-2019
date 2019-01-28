import java.util.Scanner ;
import java.util.Random;

public class GuessNumberGame {
	
	private static Scanner sc;
	private static Random generator;

	public static void game(int numberToGuess){
		boolean finished = false;
		int numberOfSteps = 0;
		int answer;
		while(!finished) {
			System.out.print("Enter your guess, between 1 and 100: ");
			answer = sc.nextInt();
			sc.nextLine();
			if(answer == numberToGuess) {
				finished = true;
			} else if (answer < numberToGuess) {
				System.out.println("too small, try again");
			} else {
				System.out.println("too large, try again");				
			}
			numberOfSteps++;
		}
		System.out.println("Congratulations ! You found the correct number in "
			+ numberOfSteps + " steps.");

	}

	public static void main(String[] args){

		sc = new Scanner(System.in);
		generator= new Random();
		String answer = "y";
		while(answer.toLowerCase().equals("y")) {
			game(generator.nextInt(100) + 1);
			System.out.print("Do you want to play again (y/n)?: ");
			answer = sc.nextLine();
		}

	}
}