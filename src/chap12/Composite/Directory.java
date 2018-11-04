package chap12.Composite;

import java.util.ArrayList;
import java.util.List;



public class Directory implements Node {

	private String name;
	
	private List<Node> children =new ArrayList<Node>();
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public Directory setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		return this;
	}
	
	
	public void add(Node node) {
		children.add(node);
	}
	
	
	
	public List<Node> getChildren() {
		return children;
	}
}


