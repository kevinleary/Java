/*

Kevin Leary
Period 2
Date: 12/17/14
Chapter: 9
Excercise: 21

*/
public class SoccerTester {

	public static void main(String[] args) {
		
		//make three teams
		
		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();
		SoccerTeam team3 = new SoccerTeam();
		
	
			
			SoccerTeam.startTournament(0, 0);
			
			
			team1.played(team1, 6, 2, 4, 5);
			team2.played(team2, 8, 9, 4, 12);
			team3.played(team3, 12, 4, 4, 20);
			
			System.out.println("Total amount of points for team one.. " + team1.getPoints(9, 3));
			System.out.println("Total amount of points for team two.. " + team2.getPoints(5, 1));
			System.out.println("Total amount of points for team three.. " + team3.getPoints(7, 5));
			
			System.out.println("Total amount of games played for team one.. " + SoccerTeam.getGoals(team1));
			System.out.println("Total amount of goals for team one.. " + SoccerTeam.getGoals(team1));
			
			System.out.println("Total amount of games played for team two.. " + SoccerTeam.getGoals(team2));
			System.out.println("Total amount of goals for team two.. " + SoccerTeam.getGoals(team2));
			
			System.out.println("Total amount of games played for team three.. " + SoccerTeam.getGoals(team3));
			System.out.println("Total amount of goals for team three.. " + SoccerTeam.getGoals(team3));
			
			
	}

}
