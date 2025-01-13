import java.util.*;

// Remove Duplicates from a String

public class RemovString{


public static String helper(String s){

String ans="";

for(int i=0;i<s.length()-1;i++){
char temp=s.charAt(i);
	for(int j=i+1;j<s.length();j++){
	if(s.charAt(j)==temp)s=s.replace(s.charAt(j),'0');	
	

	}
}
for(int i=0;i<s.length();i++){
if(s.charAt(i)!='0')ans+=s.charAt(i);

}


return ans;

}
	
	
	
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter a string to remove duplicates: ");

String s=sc.nextLine();

// calling helper function
String ans=helper(s);
System.out.println("The modified string is: "+ans);

}


}
