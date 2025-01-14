import java.util.*;
public class ReverseString{

// helper function
public static void helper(String s){

// reverse the string

char t;
String ans="";

for(int i=s.length()-1;i>=0;i--){
t=s.charAt(i);

ans+=t;

  
    
}

System.out.println(ans);

}




	public static void main(String arg[]){

// reversing a string without using inbuilt function
// we cant do s1+s2, we have to use concat()

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

// calling the function

helper(s);


	}
}
