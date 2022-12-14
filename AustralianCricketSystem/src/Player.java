import java.util.Scanner;

import operation.TestMatch;
import operation.WorldCup;

public class Player {
	String name;
	int age;
	char gender;
	double income, bonusAmt,totalSal;
	public Player(String name,  int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender=gender;
	}
	public void displayDetails(String match) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Games");
		int nGame = s.nextInt();
		System.out.println("Enter Performance: (Best/Good/Average)");
		String peformance = s.next();
		System.out.println("Enter Grade:(A/B/C");
		String grade = s.next();
		
		if(match.equalsIgnoreCase("WorldCup")) {
			WorldCup wObj = new WorldCup();
			income = wObj.calculateIncome(nGame);
			bonusAmt = wObj.calculateBonus(peformance, grade);
		}
		else if(match.equalsIgnoreCase("TestMatch")) {
			TestMatch tObj = new TestMatch();
			income = tObj.calculateIncome(nGame);
			bonusAmt = tObj.calculateBonus(peformance, grade);
		}
		else {
			System.out.println("Invalid Match name");
			System.exit(0);
		}
		
		totalSal = income + bonusAmt;
		System.out.println("Player Details: ");
		System.out.println("Name: "+name);
		System.out.println("Age:" +age);
		System.out.println("Gender: "+gender);
		System.out.println("Income: "+income);
		System.out.println("Bonus: "+bonusAmt);
		System.out.println("Toatal Salary: "+totalSal);
		
	}
}
