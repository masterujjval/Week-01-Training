import java.util.Scanner;

public class StringCompare {
	
	public static boolean compare(String s,String k){
		boolean result=true;
		if(s.length()!=k.length()){
			result=false;
		}
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=k.charAt(i)){
				result=false;
			}
		}
		return result;
	}
			
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the 1st word :- ");
        String word1 = scanner.nextLine();
        System.out.print("\nEnter the 2nd word :- ");
        String word2 = scanner.nextLine();
        System.out.println("Comparing using function :- "+compare(word1,word2));
		System.out.println("Comparing using equal function :- "+word1.equals(word2));
           }
}
