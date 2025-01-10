// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km


public class Test{
	public static void main(String []args){

		int rad=6378;
		
		double kmtomiles=0.239913; // km to miles conversion factor

		double volKm=(((4/3)*3.14)*6378*6378*6378); // volumne of earth in Km

		double miles=volKm*kmtomiles;



		System.out.println("The volume of earth in cubic kilometers is "+volKm +" and cubic miles is "+miles);
	}
}




