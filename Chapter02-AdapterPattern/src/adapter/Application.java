package adapter;

public class Application {

	
	public static void main(String[] args) {

		//요구사항을 수행하는 인스턴스
		Adapter target = new AdapterImpl();
		
		System.out.println(target.twiceOf(100.0f));
		System.out.println(target.halfOf(100.3f));
		
	}
	
	
}
