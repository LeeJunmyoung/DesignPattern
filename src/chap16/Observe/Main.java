package chap16.Observe;

public class Main {

	public static void main(String[] args){
		Observer people1 = new People("뽀로로");
		Observer people2 = new People("악어");
		Observer people3 = new People("상어");
		
		Subject youtuber1 = new Youtube("EBS");
		
		youtuber1.attach(people1);
		youtuber1.attach(people2);
		youtuber1.attach(people3);
		youtuber1.setMsesage("방송 중!!");
		
		System.out.println();
		
		youtuber1.detach(people2);
		youtuber1.setMsesage("종료 !!");
		
		
	}
	
}
