package operation;

public class TestMatch extends Game {
	float testMatchSal=8000f;
	@Override
	public double calculateIncome(int numGames) {
		
		return (testMatchSal * numGames);
	}

	@Override
	public double calculateBonus(String performance, String grade) {
		if(performance.equalsIgnoreCase("Best")) 
			bonus = 2500;
		else if(performance.equalsIgnoreCase("Good")) 
			bonus = 2000;
		else if (performance.equalsIgnoreCase("Average")) 
			bonus = 1000;
		switch(grade) {
		case "A": 
			bonus += 1500;
			break;
		case "B":
			bonus += 1000;
			break;
		case "C": 
			bonus += 500;
		default:
			System.out.println("Invalid grade enter");
			System.exit(0);
		}
	
		return bonus;
	}
	
}
