package orderedStructures;

public class Fibonacci extends Progression {

	private double prev, var; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
        // add the necessary code here		
		var = prev;
		prev = current;
		current = var+prev;
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
	}
	public String toString()
    {
        return "Fibbonaci sequence";
    }
	public boolean equalsTo(Progression p)
	{
		return false;
	}

}
