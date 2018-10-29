package chap02.Adapter;

public interface StorageEngine {

	public void createVolume(String volume, int size) ;

	public void deleteVolume() ;

	public void selectVolume(String volume) ;
	
	public void selectListVolume(String[] volume) ;
	
}
