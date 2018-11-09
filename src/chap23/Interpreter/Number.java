package chap23.Interpreter;

import java.util.Map;

public class Number implements Expression {

	int number;
	public Number(int number){
		this.number = number;
	}
	@Override
	public int interpret(Map<String, Expression> variables) {
		// TODO Auto-generated method stub
		return number;
	}

}
