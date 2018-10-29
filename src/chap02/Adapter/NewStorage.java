package chap02.Adapter;

public class NewStorage {

	public void createVolume(String volume, int size)  {
		System.out.println("변경 업체의 A볼륨을 생성하였습니다.");
	}

	public void deleteVolume() {
		System.out.println("변경 업체의 A볼륨을 삭제하였습니다.");
	}

	public void selectVolume(String volume) {
		System.out.println("변경 업체의 " + volume + "을 선택하셨습니다.");
	}
	
}
