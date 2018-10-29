package chap02.Adapter;

public class LegacyStorage  {

	public void createVolume(String volume, int size) {
		System.out.println("기존 업체의 A볼륨을 생성하였습니다.");
	}

	public void deleteVolume() {
		System.out.println("기존 업체의  A볼륨을 삭제하였습니다.");
	}

	public void selectVolume(String volume) {
		System.out.println("기존 업체의 " + volume + "을 선택하셨습니다.");
	}
	
	public void selectListVolume(String[] volume) {
		
		final int volumeLength = volume.length;
		
		for(int num =0;num<volumeLength;num++){
		System.out.println("기존 업체의 " + volume[num] + "을 선택하셨습니다.");
		}
		
	}

}
