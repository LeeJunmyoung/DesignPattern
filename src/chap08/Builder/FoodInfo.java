package chap08.Builder;

public class FoodInfo {

	public FoodInfo(Builder builder) {
		this.weight=builder.weight;
		this.calories=builder.calories;
		this.name=builder.name;
	}
	
	private final int weight;
	
	private final int calories;
	
	private final String name;
	
	public static class Builder{
		
		private  int weight;
		
		private  int calories;
		
		private  String name;
		
		public Builder setCalories(int val){
			calories = val;
			return this;
		}
		
		public Builder setWeight(int val){
			weight = val;
			return this;
		}
		
		public Builder setname(String val){
			name = val;
			return this;
		}
		
		public FoodInfo build(){
			return new FoodInfo(this);
		}
		
	}

	@Override
	public String toString() {
		return "FoodInfo [weight=" + weight + ", calories=" + calories + ", name=" + name + "]";
	}
	
}
