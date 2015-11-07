
public class AObj {

	Ainterface ainterface;
	
	public AObj(){
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		
		//위임한다.
		ainterface.funcA();//		System.out.println("AAA");
		ainterface.funcA();//		System.out.println("AAA");
		//~ 기능이 필요합니다. 
	}
}
