import java.util.*;
public class Test{


public static void string(String s){

int v=0;
int c=0;

for(int i=0;i<s.length();i++){
if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u') || (s.charAt(i)=='A') ||(s.charAt(i)=='E') || (s.charAt(i)=='I') || (s.charAt(i)=='O') || (s.charAt(i)=='U')){


v++;

}
else c++;

}
System.out.println("The vowels in the given string is: "+v+ " Consonants :"+c);

}

public static void main(String args[]){

System.out.println("Enter the text: ");
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

string(s);


}
}



