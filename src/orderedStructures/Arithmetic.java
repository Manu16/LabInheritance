package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference;
	
	public Arithmetic(double firstValue, double commonDifference) 
	{ 
		super(firstValue); 
		this.commonDifference = commonDifference;
		
	}	
	@Override
	public double nextValue() throws IllegalStateException 
	{
		current = current + commonDifference; 
		return current;
	}
	public double getTerm(int n) throws IndexOutOfBoundsException 
	{ 
	    if (n <= 0) 
	    {
	       throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
	    }
	    double value = this.firstValue(); 
	    value = this.firstValue()+(commonDifference*(n-1)); 
	    return value; 
	}
	public String toString()
    {
        return "Arith("+(int)firstValue()+","+(int)commonDifference+")";
    }
	public double getCommonFactor()
	{
	    return commonDifference;
	}
	
	
}
