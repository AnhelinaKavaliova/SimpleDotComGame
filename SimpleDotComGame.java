import java.util.Scanner;

public class SimpleDotComGame{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);

		SimpleDotCom theDotCom = new SimpleDotCom();

		int randNum = (int)(Math.random()*10);

		int[] locations = {randNum, randNum+1, randNum+2};

		theDotCom.setLocation(locations);

		boolean isAlive = true;
		int numOfGuesses = 0;

		while(isAlive)
		{
			System.out.print("Guess cell location: ");
			int guessNum = n.nextInt();
			n.nextLine();
			numOfGuesses++;

			String result = theDotCom.checkYourself(guessNum);

			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took "+ numOfGuesses+" guesses");
			}
		}
	}
}


