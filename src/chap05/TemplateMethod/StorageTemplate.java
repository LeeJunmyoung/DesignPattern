package chap05.TemplateMethod;

public abstract class StorageTemplate {

	public void attch(){
		// 볼륨 검색
		String [] volume = selectVolume();
		
		// 볼륨 정렬
		sortVolume(volume);
		
		// 호스트 매핑
		mapToHostVolume(volume);
	}
	//protected로 상속된 클래스만 접근가능하도록 동일한 패키지에서 접근하는거 어쩔수 없지만 거의 이런 모듈만 그패키지에 있고 가져다 쓰니깐...
	//접근지정자도 잘 생각해보자!!
	abstract protected String[] selectVolume();
	
	abstract protected void sortVolume(String[] volumes);
	
	abstract protected String mapToHostVolume(String[] volumes);
	
	
}
