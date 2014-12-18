/*

Kevin Leary
Period 2
Date: 12/17/14
Chapter: 9
Excercise: 21

*/
public class SoccerTeam {
	
	private int wins, losses, ties, totgames, totgoals;
	
	public void played(SoccerTeam other, int myScore, int otherScore, int totgames, int totgoals){
		
		if (myScore > otherScore)
			wins++;
		else if (myScore < otherScore)
			losses++;
		else {
			ties++;
		}
		
		totgoals = myScore + otherScore;
		totgames = wins + ties + losses;
		
	}
	
	public int getPoints(int wins, int ties){
		
		return (wins * 2) + ties;
	}
	
	public void reset(int wins, int losses, int ties){
		wins = 0;
		losses = 0;
		ties = 0;
	}
	
	public static int getGames(int totgames){
		
		return totgames;
	}
	
	public static int getGoals(int totgoals){
		
		return totgoals;
	}
	
	public static void startTournament(int totgames, int totgoals){
		
		totgames = 0;
		totgoals = 0;
		
	}
	
	
}	
