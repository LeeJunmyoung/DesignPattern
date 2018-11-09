package chap22.Command;

public class Main {
	
	public static void main(String [] args){
		
		Switch s = new Switch(new TurnOnLightCommand(),new TurnOffLightCommand());
		
		s.flipUp();
		s.flipDown();
		
	}
}
