package chop09.AbstractFactory.creator;

import chop09.AbstractFactory.abst.AbstFactory;
import chop09.AbstractFactory.abst.Button;
import chop09.AbstractFactory.abst.TextArea;

public class GuiFactory {

	public static AbstFactory getGuiFactory(){
		
		if(System.getProperty("os.name").contains("Window")){
			return new WindowGuiFactory();
		}else{
			return new LinuxGuiFactory();
		}
		
	}
	
	
	
	
}


class LinuxGuiFactory implements AbstFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}
	
}

class LinuxButton implements Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Linux 버튼입니다.");
	}
	
}

class LinuxTextArea implements TextArea{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Linux 텍스트 에이리어 입니다.");
	}
	
}


class WindowGuiFactory implements AbstFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WindowTextArea();
	}
	
	
}


class WindowButton implements Button{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Window 버튼입니다.");
	}
	
}

class WindowTextArea implements TextArea{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Window 텍스트 에이리어 입니다.");
	}
	
}