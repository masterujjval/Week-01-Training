import java.util.*;

public class Occurance{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string: ");
String s=sc.nextLine();

System.out.println("Enter the substring: ");

String sub=sc.nextLine();

// using contains string function

int t=0;
String arr[]=s.split("[\\s]");
for(String str:arr){

	if(str.contains(sub))t++;

}

System.out.println("The substring count is: "+t);
}
}
