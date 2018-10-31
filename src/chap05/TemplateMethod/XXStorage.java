package chap05.TemplateMethod;

import java.util.Arrays;

public class XXStorage extends StorageTemplate {

	@Override
	protected String[] selectVolume() {
		String [] volumes = {"D","E","C","F"};
		System.out.println("사용자의 볼륨은 : "+ Arrays.asList( volumes));
		return volumes;
	}

	@Override
	protected void sortVolume(String[] volumes) {
		System.out.println("정렬 전 볼륨 : " +Arrays.asList( volumes));
		Arrays.sort(volumes);
		System.out.println("정렬 후 볼륨 : " +Arrays.asList( volumes));
	}

	@Override
	protected String mapToHostVolume(String[] volumes) {
		
		System.out.println("MapToHost 수행 DISK : "+Arrays.asList( volumes));
		return "succes";
	}

}
