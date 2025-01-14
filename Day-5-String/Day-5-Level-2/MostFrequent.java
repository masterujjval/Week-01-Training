import java.util.*;

public class MostFrequent{
public static void helper(String s){

int cnt=0;
char c=' ';
int maxi=0;
for(int i=0;i<s.length();i++){

char t=s.charAt(i);

for(int j=i+1;j<s.length();j++){
if(t==s.charAt(j)){
cnt++;
}

}
if(cnt>maxi){
maxi=cnt;
c=s.charAt(i);
cnt=0;
}

}

System.out.println("Most frequent character is : "+c);

}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Text: ");
String s=sc.nextLine();

helper(s);

}

}
