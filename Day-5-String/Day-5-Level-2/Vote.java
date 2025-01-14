import java.util.*;
public class Toggle{

// creating a method to do the toggle program

public static void vote(int arr[]){

String ans[][]=new String [arr.length][2];

for(int i=0;i<arr.length;i++){

ans[i][0]=String.valueOf(arr[i]);

if(arr[i]>=18){
ans[i][1]="Vote";
}else if(arr[i]<=0){
ans[i][1]="invalid age";
}
else if(arr[i]<18){
ans[i][1]="cant vote";
}

}

// displaying the results

System.out.println("Age \t Vote Status");
for(int i=0;i<arr.length;i++){
System.out.println(ans[i][0]+ "\t  "+ans[i][1]);

}



}

 public static void helper(int n) {
 
 // creating an array of age of two digit of n students 
 
 int arr[]=new int[n];
 
 for(int i=0;i<n;i++){
 
 arr[i]=10+(int)(Math.random()*(99-10+1));
 //System.out.println(arr[i]);
 }
 
 vote(arr);
    }



public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students: ");
int n=sc.nextInt();

// to convert lower to upper and upper to lower

helper(n);
}

}
