package nom.nom;

public class HelloMiddleEarth
{
	public static void main(String[] args) {
		//this is my second project, will try and do as I did previously with my 2nd project
		String[] names = {"Hello", "Bobby", "Ukhphi", "Mfo"};
		
		//print greetings:
		for(int i = 0; i < names.length; i++)
		{
			System.out.println("Hello names: " + i);
		}
	}

	//I am in eclipse and want to see if I can push this comment to github concurrently with the change made in git hub

	// I am adding a comment in Git and want to see if I can pull this change in eclipse
	
	//1. I committed the second statement/comment from Git, then
	//2. I came to eclipse to add a comment(1st statement), then I attempted to commit and push
	//3. Committing was successful but the local master was not pushed to the origin(remote)
	//4.Therefore I had to pull from my class in eclipse , then resolve the conflict manually
	//5.In git staging, migrate the class to the staged changes then commit and push( merges the local and branches)
	//NB:
		//1. Always pull before working on anything
		//2. commit then attempt to push
		//3.resolve conflicts manually
		//4. in git staging- drag from unstaged to staged changes then commit and push
}
