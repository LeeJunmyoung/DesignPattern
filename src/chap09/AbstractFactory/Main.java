package chop09.AbstractFactory;

import chop09.AbstractFactory.abst.AbstFactory;
import chop09.AbstractFactory.abst.Button;
import chop09.AbstractFactory.abst.TextArea;
import chop09.AbstractFactory.creator.GuiFactory;

public class Main {

	public static void main(String[] args){
		
		
		AbstFactory motion =GuiFactory.getGuiFactory();
		
		Button button     = motion.createButton();
		TextArea textArea = motion.createTextArea();
		
		button.click();
		textArea.write();
		
	}
	
}
