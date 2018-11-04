package chap11.Bridge;

import java.awt.Toolkit;

public class Sound implements MorseCodeImpl {

	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	@Override
	public void dot()  {
		// TODO Auto-generated method stub
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void dash() {
		// TODO Auto-generated method stub
		toolkit.beep();
		toolkit.beep();
		toolkit.beep();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
