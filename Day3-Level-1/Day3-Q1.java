import java.util.Scanner;
public class Test{
public static void main(String [] args){

// Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

Scanner sc=new Scanner(System.in);

System.out.println("Enter students age: ");

int arr[]= new int [10];
// taking input from the users in every step of the loop
for(int i=0;i<10;i++){
int temp=sc.nextInt();
arr[i]=temp;
}
// performing calculations 
for(int i=0;i<10;i++){
if(arr[i]>=18){
System.out.println("The student with the age"+arr[i]+" can vote");}
else if (arr[i]<=0){
System.err.println("Invalid Age");
}
else { System.out.println("The student with age"+ arr[i]+" cannot vote");}
}
}
}

