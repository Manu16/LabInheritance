package interfaces;

import exceptions.InvalidIndexException;
import orderedStructures.Progression;


public interface OrderedNumberStructure {
	double getTerm(int n) throws InvalidIndexException; 
	void printAllTerms(int n);
}
