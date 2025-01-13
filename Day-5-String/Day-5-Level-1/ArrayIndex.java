import java.util.*;
public class ArrayIndex{

public static void errorHandle(String name[]){
        System.out.println("Attempting to access an index larger than the array length...");

try{
	System.out.println("Generating Error.."+name[name.length]);
}	catch (ArrayIndexOutOfBoundsException e){
	System.out.println("Here we got Array Index out of bound error "+e.getMessage());
	}

	catch(RuntimeException e){
	System.out.println("Here we got Runtime Error: "+e.getMessage());
	}


}


public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter your Name: ");

String n[]=new String[2];
for(int i=0;i<2;i++){

n[i]=sc.nextLine();
}

errorHandle(n);

}

}
