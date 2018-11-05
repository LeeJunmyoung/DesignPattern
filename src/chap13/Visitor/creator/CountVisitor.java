package chap13.Visitor.creator;

import chap13.Visitor.abst.Visitable;
import chap13.Visitor.abst.Visitor;

public class CountVisitor implements Visitor {

	private int number;
	
	private int age;
	
	public CountVisitor() {
		number=0;
		age=0;
	}
	
	@Override
	public void visit(Visitable visitable) {
		// TODO Auto-generated method stub
		if(visitable instanceof CaffeVisitor){
			number+=((CaffeVisitor) visitable).numberOfMember;
		}else if( visitable instanceof AgeVisitor){
			age += ((AgeVisitor) visitable).age;
		}
	}

	public int getNumber() {
		return number;
	}

	public int getAge() {
		return age;
	}

	
	

}
