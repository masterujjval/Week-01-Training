//Create a program to find the shortest, tallest, and mean height of players present in a football team.
import java.util.*;
public class ShortandTall{

int sum(int arr[]){ // method to get sum of all the heights of the players in the football team

int s=0; // initialize the s variable of counting sum
for(int i=0;i<11;i++){
s+=arr[i];
}

return s;  // returning sum as s 

}

int mean(int s,int n){ // mean function to calculate mean of all heights

return s/n;

}


int shortie(int arr[]){  // shortie funtion to calculatet the shortest height in the football team

int s=Integer.MAX_VALUE;  // MAX_VALUE  will store the maximum integer in the s so that we can compare it and then store the smallest height
for(int i=0;i<11;i++){

if(arr[i]<s)s=arr[i];
}

return s;
}

int tall(int arr[]){  // tall method to calculate the tallest height in the football team

int t=Integer.MIN_VALUE;
for(int i=0;i<11;i++){

if(arr[i]>t)t=arr[i];

}
return t;
}

	public static void main(String args[]){ // main driver function
	
         int arr[]=new int[11];
	
	 for(int i=0;i<11;i++){
	int temp=150+(int)(Math.random()*(250-150)+1); // as random value is 0.1 to 1, to change we we (min+Math.random()*(250-150)+1) so it will print between 150-250

	arr[i]=temp;


	 }
	// calling methods
	ShortandTall ob=new ShortandTall(); /* creating object so that we can use our methods, but if we create static funtion then we can call the methods directly, but without static funtion we have to call them using class object*/	
	int temp=ob.sum(arr);
    
    System.out.println("The Sum of all elements in the array is: "+ ob.sum(arr));
    System.out.println("The mean height of all the players is: "+ ob.mean(temp,11));
        System.out.println("The shortest height among all players is: "+ ob.shortie(arr));
            System.out.println("The tallest height of all the players is: "+ ob.tall(arr));
    


    

	}
}
