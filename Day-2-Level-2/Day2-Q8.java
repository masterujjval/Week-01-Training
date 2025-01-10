
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         //amar akbar and anthony ages 
         System.out.print("Enter Amar's age: ");
        int amar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthon = scanner.nextInt();
         //Taking input of height
        System.out.print("Enter Amar's height (in cm): ");
        int amarH = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int akbarH = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int anthonyH = scanner.nextInt();
	   if(anthon<amar&&anthon<akbar){
        System.out.println("The youngest friend is Anthony with age "+anthon+" years.");
	   }
	   else if(amar<anthon&&amar<akbar){
        System.out.println("The youngest friend is Amar with age "+amar+" years.");
	   }
	   else
	   {  
        System.out.println("The youngest friend is Amar with age "+akbar+" years.");
	   }
	   
	    if(anthonyH>amarH&&anthonyH>akbarH){
        System.out.println("The tallest friend is Anthony with height "+anthonyH+" in cm.");
	   }
	   else if
	   (amarH>anthonyH&&amarH>akbarH){
        System.out.println("The tallest friend is Amar with height "+amarH+" in cm.");
	   }
	   else
	   {	  
        System.out.println("The tallest friend is Akbar with height "+akbarH+" in cm.");
	  }  
	   
	}
}












