package chap15.Facade.system;

public class Computer {

	private CPU cpu;
	private HardDrive hardDrive;
	private Memory memory;
	public Computer(CPU cpu, HardDrive hardDrive, Memory memory) {
		super();
		this.cpu = cpu;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}
	
	public void startComputer(){
		cpu.cpuOn();
		memory.memoryOn();
		hardDrive.read();
		cpu.execute();
	}
	
	public void stopComputer(){
		hardDrive.detach();
		memory.memoryOff();
		cpu.cpuOff();
	}
	
}
