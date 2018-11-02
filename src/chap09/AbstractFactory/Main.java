package chap09.AbstractFactory;

import chap09.AbstractFactory.abst.AbstFactory;
import chap09.AbstractFactory.abst.Button;
import chap09.AbstractFactory.abst.TextArea;
import chap09.AbstractFactory.creator.GuiFactory;

public class Main {

	public static void main(String[] args){
		
		
		AbstFactory motion =GuiFactory.getGuiFactory();
		
		Button button     = motion.createButton();
		TextArea textArea = motion.createTextArea();
		
		button.click();
		textArea.write();
		
	}
	
}
