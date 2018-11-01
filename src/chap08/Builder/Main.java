package chap08.Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodInfo cake = new FoodInfo.Builder()
	                                .setCalories(100)
	                                .setWeight(10)
	                                .setname("cake")
	                                .build();
		
		System.out.println(cake.toString());
	//Effective Java 스타일
	}

}
