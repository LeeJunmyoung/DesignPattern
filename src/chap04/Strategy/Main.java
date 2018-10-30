package chap04.Strategy;

public class Main {

	public static void main(String[] args){
		
		Algorithm a;
		
		if(args[0].equals("bubble")){
			a= new BubbleSort();
		}else if(args[0].equals("merge")){
			a= new MergeSort();
		}else{
			a= new QuickSort();
		}
		
		a.sortAlgorithm();
		//Context 없이 수행
		
		System.out.println("");
		System.out.println("#############################");
		System.out.println("");
		SortAlgorithm sort = new SortAlgorithm(new BubbleSort());
		sort.sort();
		sort = new SortAlgorithm(new MergeSort());
		sort.sort();
		sort = new SortAlgorithm(new QuickSort());
		sort.sort();
		//Context를 만들어서 제어
		//스트래티지 패턴을 이용하는 역할을 수행한다.
		//필요에 따라 동적으로 구체적인 전략을 바꿀 수 있도록 setter 메서드(‘집약 관계’)를 제공한다.
		
		
	}

}
