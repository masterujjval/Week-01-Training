import java.util.*;
public class Split1{






// caualting the length of the string without using length() 
public static int len(String s){
// appending 0 as this will indicates that the string ends here
int count=0;

int i=0;
while(i>=0){
try{
s.charAt(i);
count++;
i++;

}catch (Exception e){
return count;

}

}
return count;
}


	public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    

System.out.println("Enter the text to convert it to words: ");
String s=sc.nextLine();
    
// calling the function to calculate the string length without method

System.out.println("The length of the string without in built method is "+len(s));
    

	}

}
