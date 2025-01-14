/* 5. Find the Longest Word in a Sentence
Problem:
Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/

import java.util.*;
public class LongestWord{


public static  void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the text" );
String s=sc.nextLine();

// using split method to solve this dilemma
String re="[\\s]";
String arr[]=s.split(re);

int m=0;

for(String x:arr){System.out.println(x);
m=Math.max(m,x.length());
}

System.out.println("The maximum length of the word is: "+m);

}
}
