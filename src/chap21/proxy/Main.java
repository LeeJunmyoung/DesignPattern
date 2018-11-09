package chap21.proxy;

public class Main {

	public static void main(String[] args) throws Exception{
		Executor executor = new ExcutorProxy("1234");
		executor.commandExec("cmd.exe /c dir");
		
		Executor command2 = new ExcutorProxy("5678");
		command2.commandExec("cmd.exe /c dir");
		
	}
	
}
