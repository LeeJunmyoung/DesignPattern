package chap11.Bridge;

public class MorseCode {
	private MorseCodeImpl morseCode;

	public MorseCode(MorseCodeImpl function) {
		this.morseCode = function;
	}

	public void setFunction(MorseCodeImpl function) {
		this.morseCode = function;
	}

	public void dot() {
		morseCode.dot();
	}

	public void dash() {
		morseCode.dash();
	}

	public void space() {
		morseCode.space();
	}
}
