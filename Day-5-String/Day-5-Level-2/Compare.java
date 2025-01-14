import java.util.*;
public class Compare{

public static void helper(String s, String t){
for(int i=0;i<s.length();i++){
int temp=s.charAt(i);
int temp2=t.charAt(i);

if(temp<temp2){
System.out.println(s + " Comes before "+t+ " in lexicographical order");
break;

}else if(temp>temp2){

System.out.println(t + " Comes before "+s+ " in lexicographical order");
break;
}


}
if(s.equals(t))
System.out.println("The "+s+ "and " +t+ " are equal");

}



public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the text1: ");
String s=sc.nextLine();


System.out.println("Enter the text2: ");

String t=sc.nextLine();
helper(s,t);


}	

}
