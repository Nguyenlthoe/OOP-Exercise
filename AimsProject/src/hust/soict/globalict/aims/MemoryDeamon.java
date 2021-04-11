package hust.soict.globalict.aims;



public class MemoryDeamon implements java.lang.Runnable{
	private long memoryUsed = 0;
	public MemoryDeamon() {
		super();
	}
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		used = rt.totalMemory() - rt.freeMemory();
		if(used != memoryUsed) {
			System.out.println("\tMemory used = " + used);
			memoryUsed = used;
		}
	}
}
