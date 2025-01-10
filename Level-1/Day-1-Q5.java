// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.


public class Test{
	public static void main(String []args){

		int pens=14;
		int student=3;

		System.out.println("The Pen Per Student is "+(pens/student)+" and the remaining pen not distributed is "+ (pens-(pens/student)));
	}
}

