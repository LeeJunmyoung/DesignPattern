package chap12.Composite;

public class File implements Node{

	private String name;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public File setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		return this;
	}

}
