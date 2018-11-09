package chap21.proxy;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExcutorImpl implements Executor {

	@Override
	public void commandExec(String cmd) throws Exception {
		// TODO Auto-generated method stu
		Process process = Runtime.getRuntime().exec(cmd);
		System.out.println("Command : "+ cmd);
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}
