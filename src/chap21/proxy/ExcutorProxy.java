package chap21.proxy;

public class ExcutorProxy implements Executor{

	private boolean checkAdmin;
	private Executor executor;
	
	public ExcutorProxy(String pw) {
		if (pw.equals("1234")){
			checkAdmin = true;
		}
		executor = new ExcutorImpl();
	}
	
	
	@Override
	public void commandExec(String cmd) throws Exception {
		// TODO Auto-generated method stub
		if(checkAdmin){
			executor.commandExec(cmd);
		}else{
			System.out.println("권한이 없습니다.");
		}
	}

}
