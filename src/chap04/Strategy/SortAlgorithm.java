package chap04.Strategy;

public class SortAlgorithm {
	
	private Algorithm algorithm;
	
	public SortAlgorithm(Algorithm algorithm) {
		this.algorithm=algorithm;
	}

	
	public void sort() {
		// TODO Auto-generated method stub
		algorithm.sortAlgorithm();
	}
	
	
	
	
	

}
