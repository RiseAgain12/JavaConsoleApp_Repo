import java.util.Scanner;

public class PlayerTest {

	public static void main(String[] args) {
		Player pObj = new Player("John", 22, 'M');
		Scanner s = new Scanner(System.in);
		System.out.println("Enter match type:Testmatch/Worldcup");
		String matchType = s.next();
		
		
		pObj.displayDetails(matchType);

	}

}
