package orderedStructures;

import java.security.InvalidParameterException;
import interfaces.OrderedNumberStructure; 

public abstract class Progression implements OrderedNumberStructure {
	private double first;       // the first value
	protected double current;
	private boolean executed = false;
    // current is the current value of the object � it changes
	// to �the value of the next term� whenever method 
	// �nextValue� is applied to the object.

	public Progression(double first) 
	{ 
		this.first = first; 
		current = first; 
	}

	public double firstValue() { 
		current = first; 
		executed =true;
		return current;
	}
		
	public void printAllTerms(int n) throws InvalidParameterException {
		if (n <= 0) 
			throw new InvalidParameterException("printAllTerms: Invalid argument value = " + n);  

		System.out.println("Index --- Term Value"); 
		for (int i=1; i<=n; i++) { 
			System.out.println((i) +  "---" + this.getTerm(i));  
		}
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}
	
	public abstract double nextValue();

	public boolean equalsTo(Progression p)
	{
		if(this.getTerm(1)==p.getTerm(1)&&this.getTerm(5)==p.getTerm(5))
		{
			return true;
		}
		return false;
	}
	public Progression add(Progression other)
	{
		double newFirstValue = this.firstValue() + other.firstValue();
		double newCommonDifference = (this.getTerm(2)-this.firstValue())+(other.getTerm(2)-other.firstValue());
		Progression newArithProg = new Arithmetic(newFirstValue, newCommonDifference);
		return newArithProg ;
	}
}
