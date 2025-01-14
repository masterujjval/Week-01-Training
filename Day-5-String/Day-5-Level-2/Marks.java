import java.util.*;
import java.util.Random;

public class Toggle{

// creating a method to do the toggle program

public static void grade(int arr[][]){

System.out.println("Grade \t \t Remarks \t \t \t \t \t   \t \t \tmarks");

for(int i=0;i<arr.length;i++){
if(arr[i][2]>=80){
System.out.println("A \t above agency normalised standards \t \t \t \t \t80% and above");
}

else if(arr[i][2]>70 && arr[i][2]<80){
System.out.println("B \t at agency normalised standards \t \t \t \t70% and 79%");
}

else if(arr[i][2]>60 && arr[i][2]<70){
System.out.println("C \t below but approaching agency normalised standards \t \t \t  60% and 69%");
}

else if(arr[i][2]>50 && arr[i][2]<60){
System.out.println("D \t well below agency normalised standards\t \t \t \t \t50% and 59%");
}

else if(arr[i][2]>40 && arr[i][2]<50){
System.out.println("E \t too below agency normalised standards \t \t \t \t \t40% and 49%");
}

else if(arr[i][2]<40){
System.out.println("R \t Remedial needed \t \t \t \t \t \t \t39% and below");
}

}


}



public static void mathy(int arr[]){

// here we calculate average and percentage

// average

int ans[][]=new int[arr.length][3];

// 0-> total marks 1->average 2->percentage

for(int i=0;i<arr.length;i++){
ans[i][0]=arr[i];

// average 
ans[i][1]=(arr[i]/3);

//percentage
ans[i][2]=((arr[i]*100)/300);
//System.out.println(ans[i][2]);
}

grade(ans);
}

 public static void helper(int n) {
 
 // creating an array of age of two digit of n students 
 
 int arr[]=new int[n];
 
 for(int i=0;i<n;i++){
 int m=10 + (int)(Math.random() * (99 - 10 + 1));
 int p=10 + (int)(Math.random() * (99 - 10 + 1));
 int c=10 + (int)(Math.random() * (99 - 10 + 1));
 arr[i]=m+p+c;
 //System.out.println(arr[i]);
 }
 
 mathy(arr);
    }



public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students: ");
int n=sc.nextInt();

// to convert lower to upper and upper to lower

helper(n);
}

}
