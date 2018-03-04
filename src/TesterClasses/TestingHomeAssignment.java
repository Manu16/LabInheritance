package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class TestingHomeAssignment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Progression p = new Arithmetic(3, 2);
		Progression p2 = new Arithmetic(5, 8);
		Progression p3 = new Geometric(2, 3);
		Progression p4 = new Geometric(2, 3);
		Progression p5 = new Geometric(2, 3);
		Progression p6 = new Geometric(2, 1);
		System.out.println("Are the two Arith progressions equal?: "+p.equalsTo(p2));
		System.out.println("Are the two Arith progressions equal?: "+p3.equalsTo(p4));
		System.out.println("Are the two Arith progressions equal?: "+p5.equalsTo(p6));
		System.out.println("Testing addition/substraction of progressions with "+p+" and "+p2+". New Arith progression is: "+p.add(p2));
				
	}
}
