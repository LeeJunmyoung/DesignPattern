package chap02.Adapter;

public class LegacyAdapter implements StorageEngine {
	
	LegacyStorage legacyStorage ;
	
	public LegacyAdapter(LegacyStorage legacyStorage ) {
		this.legacyStorage= legacyStorage;
	}
	

	@Override
	public void createVolume(String volume, int size) {
		// TODO Auto-generated method stub
		legacyStorage.createVolume(volume, size);
	}

	@Override
	public void deleteVolume() {
		// TODO Auto-generated method stub
		legacyStorage.deleteVolume();
	}

	@Override
	public void selectVolume(String volume) {
		// TODO Auto-generated method stub
		legacyStorage.selectVolume(volume);
	}

	@Override
	public void selectListVolume(String[] volume) {
		// TODO Auto-generated method stub
		legacyStorage.selectListVolume(volume);
	}

}
