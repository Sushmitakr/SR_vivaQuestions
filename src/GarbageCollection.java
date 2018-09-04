
public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runtime rs = Runtime.getRuntime();
	System.out.println("Free memory before garbage collection"+ rs.freeMemory());
	rs.gc();
	System.out.println("Free memory after garbage collection"+ rs.freeMemory());
	}

}
