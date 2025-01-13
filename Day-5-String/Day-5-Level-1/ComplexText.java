import java.util.*;
public class ComplexText{


public static String convertUpper(String s){
String temp=s;
for(int i=0;i<s.length();i++){
// here convert lowercase to uppercase
int t=temp.charAt(i);
if(t>=97){
int r =t-32;
temp=temp.replace((char)t,(char)r);
}
}
return temp;
}

public static boolean compare(String s, String t){
if(s.length()!=t.length())return false;
else{
for(int i=0;i<s.length();i++){

if(s.charAt(i)!=t.charAt(i))return false;

}
}
return true;
}

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the complex text: ");
String s=sc.nextLine();
String t=convertUpper(s);
System.out.println("The converted text is: "+convertUpper(s));

System.out.println("The converted text is equal?: "+compare(s,t));

String temp=t.toLowerCase();
System.out.println("The converted text using toLowerCase() method is: "+temp);






}


}
