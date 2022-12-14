package operation;

public class WorldCup extends Game {
	float worldCupSal=15000f;
	@Override
	public double calculateIncome(int numGames) {
		
		return (worldCupSal * numGames);
	}

	@Override
	public double calculateBonus(String performance, String grade) {
		if(performance.equalsIgnoreCase("Best")) 
			bonus = 3500;
		else if(performance.equalsIgnoreCase("Good")) 
			bonus = 2500;
		else if (performance.equalsIgnoreCase("Average")) 
			bonus = 2000;
		switch(grade) {
		case "A": 
			bonus += 2000;
			break;
		case "B":
			bonus += 1500;
			break;
		case "C": 
			bonus += 1000;
		default:
			System.out.println("Invalid grade enter");
			System.exit(0);
		}
	
		return bonus;
	}
	
}
 


