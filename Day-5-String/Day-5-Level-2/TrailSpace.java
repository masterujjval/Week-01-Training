import java.util.*;
public class Toggle{

// creating a method to do the toggle program

 public static void helper(String s) {
        StringBuilder t = new StringBuilder(); // using StringBuilder class because we are modifying changes

        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
             if (c!=' ') { // here we use character class whcih is a wrapper class for char dt
                t.append(c);
            } else if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
                t.append(c);
            }
        }

        System.out.println("The modified string is: " + t);
    }



public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the text: ");
String s=sc.nextLine();

// to convert lower to upper and upper to lower

helper(s);
}

}
