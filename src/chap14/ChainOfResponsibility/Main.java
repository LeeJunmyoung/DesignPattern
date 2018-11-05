package chap14.ChainOfResponsibility;

public class Main {

	public static void main(String [] args){
		

		Calculator plus = new PlusCalculator();
		Calculator sub = new SubCalculator();
		Calculator multiple = new MultipleCalculator();
		Calculator division = new DivisionCalculator();
		
		plus.setNextCalculator(sub);
		sub.setNextCalculator(multiple);
		multiple.setNextCalculator(division);
		
		Request request1 = new Request(1,2,"+"); //3
		Request request2 = new Request(10,2,"-");//8
		Request request3 = new Request(9,8,"*");//8
		Request request4 = new Request(10,2,"/");//8
		
		plus.process(request1);
		plus.process(request2);
		plus.process(request3);
		plus.process(request4);
		
	}
}
