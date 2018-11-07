package chap18.State;

public class Alarm {
	
	protected AlarmState alarmState;

	public Alarm(){
		alarmState=offState;
	}
	
	public void on(){
		alarmState.alarmOn();
	}
	
	public void off(){
		alarmState.alarmOff();
	}
	
	
	private AlarmState offState = new AlarmState() {

		@Override
		public void alarmOn() {
			// TODO Auto-generated method stub
			System.out.println("ALARM ON DARRRRRRR!!!!!");
			alarmState = onState;
		}

		@Override
		public void alarmOff() {
			// TODO Auto-generated method stub
			System.out.println("NOTING!!!!!");
		}
	};

	private AlarmState onState = new AlarmState() {

		@Override
		public void alarmOn() {
			// TODO Auto-generated method stub
			System.out.println("NOTING!!!!!");
		}

		@Override
		public void alarmOff() {
			// TODO Auto-generated method stub
			System.out.println("ALARM OFF");
			alarmState=offState;
		}
	};
}

interface AlarmState {

	void alarmOn();

	void alarmOff();
}