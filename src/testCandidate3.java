import java.util.ArrayList;

public class testCandidate3{

	static ArrayList<candidate2> c = new ArrayList<candidate2>();

	public static void main(String args[]){
		c.add( new candidate2("Michael Duffy", 6000) );
		c.add( new candidate2("Tim Robinson", 2500) );
		c.add( new candidate2("Joe Ashtony", 1800) );
		c.add( new candidate2("John Smith", 5000) );
		c.add( new candidate2("Mary Miller", 4000) );

		printResults();
		System.out.printf("There is A total of %d Votes%n%n",getTotal());
		replaceName("Michael Duffy", "John Elmos");
		printResults();
		System.out.printf("There is A total of %d Votes%n%n",getTotal());
		replaceVotes("Tim Robinson",9999);
		printResults();
		System.out.printf("There is A total of %d Votes%n%n",getTotal());
		replaceCandidate("Mary Miller", "John Smith");
		printResults();
		System.out.printf("There is A total of %d Votes%n%n",getTotal());
	}

	public static void printVotes(){
		for(candidate2 i : c){
			System.out.println(i);
		}
	}
	public static int getTotal(){
		int tot = 0;
		for(candidate2 i : c){
			tot += i.getVotes();
		}	
		return tot;
	}	
	public static void printResults(){
		int tot = getTotal();
		System.out.printf("%-15s%15s%11s%s%n","Name","Votes","","% of total votes");
		for(candidate2 i : c){
			System.out.printf("%-15s%15s%15.1f%%%n",i.getName(),i.getVotes(),(float)i.getVotes()/tot*100);
		}
        System.out.println();
	}
	public static void replaceName(String name, String rep){
		System.out.printf("Changing %s's name to %s%n",name,rep);
		for(candidate2 i : c){
			if(i.getName() == name){
				i.setName(rep);
				return;
			}
		}
	}
	public static void replaceVotes(String name, int repVotes){
        System.out.printf("altering %s's votes%n",name);
		for(candidate2 i : c){
			if(i.getName() == name){
				i.setVotes(repVotes);
				return;
			}
		}
	}
	public static void replaceCandidate(String name, String repName){
		int repVotes=0;
        System.out.printf("replacing %s with %s%n", name, repName);
		for(candidate2 i : c){
			if(i.getName() == repName){
				repVotes = i.getVotes();
				break;
			}
		}
		for(candidate2 i : c){
			if(i.getName() == name){
				i.setName(repName);
				i.setVotes(repVotes);
				return;
			}
		}
	}
}
