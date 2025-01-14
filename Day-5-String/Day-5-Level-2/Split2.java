import java.util.*;
public class Split2{




public static String[] helper(String s){
int spaces=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)==' ')spaces++;  // counting spaces for creating string array
}

String t[]=new String[spaces+1];
int j=0;
String temp="";
for(int i=0;i<s.length();i++){

if(s.charAt(i)!=' '){
temp+=s.charAt(i);

}
else if((s.charAt(i)==' ') || (i==s.length()-1)){
t[j]=temp;
temp="";
j++;

}


}
return t;

}

//Array method to print word length and the word itself

// calucualting the length of the string without using length() 
public static int len(String s){
s+='0'; // appending 0 as this will indicates that the string ends here
int count=0;
int i=0;
while(s.charAt(i)!='0'){
count++;
i++;
}
return count;
}


	public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    

System.out.println("Enter the text to convert it to words: ");
String s=sc.nextLine();
    
// calling the function to calculate the string length without method

System.out.println("The length of the string without in built method is "+len(s));


String ans[]=helper(s); // we get the string array without using split method 

// comparing with inbuilt function
boolean b=true;
String sp[] =s.split("[\\s]");
for(int i=0;i<ans.length;i++){
if(ans[i]!=null && sp[i]!=null){
String temp=ans[i];
//System.out.println(temp);
String temp2=sp[i];
//System.out.println(temp2);
if(!(temp2.equals(temp))){

b=false;
break;
}}
}

System.out.println("is two String array equal?: "+b);
    

	}

}
