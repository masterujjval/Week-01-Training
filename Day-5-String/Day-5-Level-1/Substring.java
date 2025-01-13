import java.util.*;

public class Substring{


public static String helper(String str,int s, int e){

// using charAt to crate a substring 
String ans="";

for(int i=s;i<e;i++){

ans+=str.charAt(i);
}
return ans;
}


public static void main(String args[]){

Scanner sc=new Scanner (System.in);

System.out.println("Enter the string: ");

String s=sc.nextLine();

System.out.println("Enter the start and end index: ");
int st=sc.nextInt();
int e=sc.nextInt();

String ans=helper(s,st,e);

String sub=s.substring(st,e);

System.out.println("Is the two substring same? "+(sub.equals(ans))); // == operator in String checks for refernce point thus gives false (String is class in java )
System.out.println(ans);
System.out.println(sub);

}
}
