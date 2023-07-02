public class SimpleDotCom{
	int[] location;
	int numberOfHits = 0;

	public void setLocation(int[] location){
		this.location = location;
	}

	public String checkYourself(int guessNum){
		String result = "miss";
		int checkNum = -1;
		for(int cell:location){
			if(checkNum == guessNum) break;
			if(cell == guessNum){
				checkNum = guessNum;
				result = "hit";
				numberOfHits++;
				break;
			}
		}
		if(numberOfHits == 3){
		result = "kill";
		}

		System.out.println(result);
		return result;
	}
}