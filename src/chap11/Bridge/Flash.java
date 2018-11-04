package chap11.Bridge;

public class Flash implements MorseCodeImpl{

	@Override
	public void dot() {
		// TODO Auto-generated method stub
		System.out.print("반짝! ");
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		System.out.print("번쩌어어억!");
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		 System.out.print("   ");
	}

}
