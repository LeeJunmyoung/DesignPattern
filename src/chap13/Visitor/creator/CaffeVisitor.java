package chap13.Visitor.creator;

import chap13.Visitor.abst.Visitable;
import chap13.Visitor.abst.Visitor;

public class CaffeVisitor implements Visitable {
	
	int numberOfMember;

	public CaffeVisitor(int numberOfMember){
		this.numberOfMember=numberOfMember;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	
	

}
