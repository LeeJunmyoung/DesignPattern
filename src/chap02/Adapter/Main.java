package chap02.Adapter;

public class Main {

	public static void main(String[] args) {
		
		StorageEngine storageEngine ;
		if(args[0].equals("LEGACY")){
			storageEngine= new  LegacyAdapter(new LegacyStorage());
		}else{
			storageEngine= new NewStorageAdapter(new NewStorage());
		}
		
		String[] storageId = {"AAAA","BBBB"};
		System.out.println("##################");
		System.out.println();
		storageEngine.createVolume("ADEF", 200);
		System.out.println();
		System.out.println("##################");
		System.out.println();
		storageEngine.deleteVolume();
		System.out.println();
		System.out.println("##################");
		System.out.println();
		storageEngine.selectListVolume(storageId);
		System.out.println();
		System.out.println("##################");
		System.out.println();
		storageEngine.selectVolume("CCCC");
		System.out.println();
		System.out.println("##################");
		
		
		
	}
	
}
