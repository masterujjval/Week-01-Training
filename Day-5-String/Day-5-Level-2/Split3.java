import java.util.*;
public class Split3{






//Array method to print word length and the word itself
public static String [][] conversionArray(String s){

String temp="";
String ans[][]=new String[s.length()/2][2];
int a=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)!=' '){
temp+=s.charAt(i);

}
else if((s.charAt(i)==' ') || (i==s.length()-1)){
ans[a][0]=temp;
ans[a][1]=String.valueOf(temp.length());
a++;
temp="";
}


}
ans[a][0]=temp;
ans[a][1]=String.valueOf(temp.length());
a++;
temp="";

return ans;

}
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
    
String ans[][]=conversionArray(s);
System.out.println("Word  Length");
for(int i=0;i<ans.length;i++){

if(ans[i][0]!=null){System.out.printf("%s \t %s \n",ans[i][0],ans[i][1]);



}


}
// calling the function to calculate the string length without method

System.out.println("The length of the string without in built method is "+len(s));
    

	}

}
