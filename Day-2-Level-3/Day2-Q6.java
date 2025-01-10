/*Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/

import java.util.Scanner;
public class Test{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double x=sc.nextDouble();

		System.out.println("Enter 2nd number: ");
		double y=sc.nextDouble();


		System.out.println("Enter operator (+, -, /, *): ");
		char op=sc.next().charAt(0);

		switch(op){
			case '+': System.out.printf("Sum of two integers is %.2f ",x+y);break;
			case '-': System.out.printf("Substraction of two integers is %.2f ",x-y);break;

			case '*': System.out.printf("Multiplication of two integers is %.2f ",x*y);break;

			case '/': System.out.printf("Division of two integers is %.2f ",x/y);break;
		}
		System.out.println("\n");
		sc.close();
	}
}





