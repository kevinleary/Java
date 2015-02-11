
public class DiplomaWithHonors extends Diploma{
	
	public DiplomaWithHonors(String n, String d){
		super(n, d);		//calls the super constuct to get the instance variables
	}
	
	public String toString(){
		
		return super.toString() + "\n*** with honors ***";
	}			//calls the super toString() from Diploma 
}
