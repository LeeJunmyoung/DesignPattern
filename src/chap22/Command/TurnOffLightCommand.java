package chap22.Command;

public class TurnOffLightCommand implements Command {
	
	
	private Light light;
	
	public TurnOffLightCommand(){
		this.light=new Light();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();
	}
	
	
	
}
