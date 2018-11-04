package chap11.Bridge;

public class PrintMorseCode extends MorseCode {

	public PrintMorseCode(MorseCodeImpl function) {
		super(function);
		// TODO Auto-generated constructor stub
	}

	public PrintMorseCode S() {

		dot();
		dot();
		dot();
		
		space();

		return this;
	}

	public PrintMorseCode O() {

		dash();
		dash();
		dash();
		
		space();

		return this;
	}
	
	public PrintMorseCode I() {

		dot();
		dot();
		
		space();

		return this;
	}
	
	public PrintMorseCode M() {

		dash();
		dash();
		
		space();

		return this;
	}
	
	public PrintMorseCode Y() {

		dash();
		dot();
		dash();
		dash();

		space();
		
		return this;
	}

	public PrintMorseCode U() {

		dot();
		dot();
		dash();

		return this;
	}

}
