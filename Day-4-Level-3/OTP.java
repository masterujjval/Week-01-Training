//Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
import java.util.*;
public class OTP{

public static int otp(){ // static funtion to call without class reference and for generating the OTPs

// create 6digit random otp

int s=0;
s=100000 + (int)(Math.random() * (999999 - 100000 + 1));
return s;
}

public static boolean validate(int arr[]){

for(int i=1;i<10;i++){

if(arr[i-1]==arr[i])return false;
}
return true;

}

public static void main(String args[]){

int arr[]=new int [10];
for(int i=0;i<10;i++){

arr[i]=OTP.otp();
System.out.println(arr[i]);
}

System.out.println(OTP.validate(arr));

// calling the funtion to store the OTP in the array


}

}
