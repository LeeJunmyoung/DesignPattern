package chap11.Bridge;

public class Word implements MorseCodeImpl{

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print("·");
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("-");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

}
