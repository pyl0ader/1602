public class candidate2{
	private String name;
	private int numVotes;
	
	public candidate2(String name, int n){
		this.name = name;
		numVotes = n;
	}

	public String toString(){
		return String.format("%s:\t%d Votes",name,numVotes);
	}

	public String getName(){
		return name;
	}
	public int getVotes(){
		return numVotes;
	}

	public void setName(String n){
		name = n;
	}
	public void setVotes(int v){
		numVotes = v;
	}
}
