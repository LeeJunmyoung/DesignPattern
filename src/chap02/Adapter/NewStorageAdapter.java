package chap02.Adapter;

public class NewStorageAdapter implements StorageEngine{

	NewStorage newStorage;
	
	NewStorageAdapter(NewStorage newStorage){
		this.newStorage = newStorage;
	}
	
	@Override
	public void createVolume(String volume, int size) {
		// TODO Auto-generated method stub
		newStorage.createVolume(volume, size);
	}

	@Override
	public void deleteVolume() {
		// TODO Auto-generated method stub
		newStorage.deleteVolume();
	}

	@Override
	public void selectVolume(String volume) {
		// TODO Auto-generated method stub
		newStorage.selectVolume(volume);
	}

	@Override
	public void selectListVolume(String[] volume) {
		// TODO Auto-generated method stub
		final int volumeLength = volume.length;
		for(int num=0; num<volumeLength;num++){
			System.out.println("변경업체의 " + volume[num] + "을 선택하셨습니다.");
		}
		
		
	}

}
