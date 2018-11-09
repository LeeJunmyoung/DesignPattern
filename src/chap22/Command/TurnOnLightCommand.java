package chap22.Command;

public class TurnOnLightCommand implements Command {
	
	
	private Light light;
	
	public TurnOnLightCommand(){
		this.light=new Light();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOn();
	}
	
	
	
}
