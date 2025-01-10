/* Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/

import java.util.Scanner;
public class Test{
public static void main(String [] args){

double arr[][]=new double[10][2];
Scanner sc=new Scanner(System.in); // scanner class for taking input from the user
double sum=0; // calculating for total bonus payout
for(int i=0;i<10;i++){
System.out.println("Enter the Salary and Year of Service of "+(i+1)+ " Employee");
double temp=sc.nextDouble();
double temp2=sc.nextDouble();
if(temp <0 || temp2<0){
int flag=0;
while(flag==0){ // keep prompting the user to enter the valid input as long as user doesnt enter the +v integer
System.out.println("Enter the Salary and Year of Service again: ");
temp=sc.nextInt();
temp2=sc.nextInt();
if(temp>=0 && temp2>=0){flag=1;}
}
}

arr[i][0]=temp;
arr[i][1]=temp2;

}

double newSal[][]=new double [10][2];

for(int i=0;i<10;i++){
if(arr[i][1]>=5){
double temp=arr[i][0];
double bonus=0.05*temp;
sum+=bonus;
newSal[i][0]=arr[i][0]+bonus; // new salary is here
newSal[i][1]=arr[i][0];      // old salary is being stored in the new array

}else{
double temp=arr[i][0];
double bonus=0.02*temp;
sum+=bonus;
newSal[i][0]=arr[i][0]+bonus; // new salary is here
newSal[i][1]=arr[i][0];

}


}

for(int i=0;i<10;i++){
System.out.println("New salary is: "+newSal[i][0]+", Old salary was :"+newSal[i][1]);

}
System.out.printf("Total bonus payout is: %.2f",sum);




}
}

