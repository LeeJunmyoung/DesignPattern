package chap22.Command;

public class Switch {

	private Command onCommand;
	private Command offCommand;

	public Switch(Command onCommand,Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public void flipUp(){
		onCommand.execute();
	}
	
	public void flipDown(){
		offCommand.execute();
	}
}
