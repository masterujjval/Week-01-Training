import java.util.Scanner;

public class CharA{
	
	public static char[] stringMaker(String s){
		char[] result =new char[s.length()];
		
		for(int i=0;i<s.length();i++){
			
			result[i]=s.charAt(i);
		
		}
		return result;
	}
			
			
    public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);

//input from users

        System.out.print("\nEnter the word :- ");
        String word1 = sc.nextLine();
        boolean r=true;
		char[] res=word1.toCharArray();
		char[] ans=stringMaker(word1);
		for(int i=0;i<word1.length();i++){
			if(ans[i]!=res[i]){
				r=false;
			}
		}
		for(int i=0;i<word1.length();i++){
			System.out.println(ans[i]);
				
		}
		for(int i=0;i<word1.length();i++){
			System.out.println(res[i]);
				
		}
			System.out.println(r);
		
		
           }
}
