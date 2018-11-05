package chap14.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Calculator {

	private Calculator nextCaulator;
	
	public void setNextCalculator (Calculator nextCaulator){
		this.nextCaulator=nextCaulator; 
	}
	
	public boolean process(Request request){
		
		if(operator(request)){
			return true;
		}else{ 
			if(nextCaulator!=null)
			nextCaulator.process(request);
		}
		return false;
		
	}
	
	abstract protected boolean operator(Request request);
	
}
