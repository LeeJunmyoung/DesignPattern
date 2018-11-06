package chap15.Facade;

import chap15.Facade.system.CPU;
import chap15.Facade.system.Computer;
import chap15.Facade.system.HardDrive;
import chap15.Facade.system.Memory;

public class Main {

	public static void main(String[] args){
		Computer computer = new Computer(new CPU(), new HardDrive(), new Memory());
		computer.startComputer();
		System.out.println();
		computer.stopComputer();
	}
	
}
