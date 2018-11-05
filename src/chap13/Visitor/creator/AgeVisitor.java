package chap13.Visitor.creator;

import chap13.Visitor.abst.Visitable;
import chap13.Visitor.abst.Visitor;

public class AgeVisitor implements Visitable {
	
	int age;

	public AgeVisitor(int age){
		this.age=age;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	
	

}