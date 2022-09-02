//I think this is what i was supposed to do, but if im wrong let me know and ill change it
public class Ch2b_1 {
	final int finVar = 10;
	static int statVar = 10;
	public static int pubVar = 10;
	//public int pubVar = 10;
	public static void main(String args[]) {
		System.out.println("Static Variable: "+ statVar);
		statVar = 5;
		System.out.println("Static Variable: "+ statVar);
		pubVar = 5;
		System.out.println("Public Variable: "+ pubVar);
		{
			int pubVar = 10;
			System.out.print(pubVar);
		}
		//commented out because it stops the code
		//finVar = 5;
		//java spring
	}
}
