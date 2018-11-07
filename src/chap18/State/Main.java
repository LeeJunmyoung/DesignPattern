package chap18.State;

public class Main {

	public static void main(String[] args) {
		Alarm alarm = new Alarm();

		alarm.off();
		alarm.off();
		alarm.off();

		System.out.println("=======================");
		
		alarm.on();
		alarm.on();

		System.out.println("=======================");
		
		alarm.off();
		alarm.off();
		
		System.out.println("=======================");

		alarm.on();
		
		System.out.println("=======================");

		alarm.off();
		
		System.out.println("=======================");

		alarm.on();
		
		System.out.println("=======================");

		alarm.off();
	}

}
