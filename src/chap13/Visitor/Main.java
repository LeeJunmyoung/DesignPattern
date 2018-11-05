package chap13.Visitor;

import java.util.ArrayList;

import chap13.Visitor.abst.Visitable;
import chap13.Visitor.creator.AgeVisitor;
import chap13.Visitor.creator.CaffeVisitor;
import chap13.Visitor.creator.CountVisitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Visitable> as = new ArrayList<Visitable>();
		
		as.add(new CaffeVisitor(1));
		as.add(new CaffeVisitor(2));
		as.add(new CaffeVisitor(4));
		as.add(new CaffeVisitor(5));
		as.add(new AgeVisitor(20));
		as.add(new AgeVisitor(50));
		as.add(new AgeVisitor(72));
		as.add(new AgeVisitor(132));

		CountVisitor visitor = new CountVisitor();
		for (Visitable va : as) {
			va.accept(visitor);
		}
		System.out.println("방문자 수 :"+visitor.getNumber());
		System.out.println("고객 평균 연령 : "+ visitor.getAge() / visitor.getNumber());
	}

}
