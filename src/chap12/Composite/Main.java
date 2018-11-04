package chap12.Composite;

public class Main {

	
	private static String blank = "";
	
	public static void main(String[] args) {
		
		Directory dir = new Directory().setName("root");
		File systemFile = new File().setName("SystemFile");
		Directory programfileDir = new Directory().setName("program file");
		File mysql = new File().setName("MYSQL FILE");
		File java8 = new File().setName("JAVA 8");
		Directory system32 = new Directory().setName("system 32");
		File cmd =new File().setName("cmd.exe");
		
		
		
		
		dir.add(systemFile);
		dir.add(programfileDir);
			programfileDir.add(mysql);
			programfileDir.add(java8);
			programfileDir.add(system32);
				system32.add(cmd);
			
			
		System.out.println("root name: " + dir.getName());
		
		show(dir);
		
		
	}
	
	
	private static void show(Node node){
		System.out.println(blank+node.getName());
		if(node instanceof Directory){
			blank+="  ";
			for (Node c : ((Directory)node).getChildren()) {
				show(c);
			}
			
		}
		
	}
}
