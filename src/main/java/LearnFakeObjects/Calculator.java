package LearnFakeObjects;

public class Calculator {
	
	CalService service;
	
	public Calculator(CalService service) {
		this.service=service;
	}
	
//	public int add(int i,int j) {
//		return i+j;
//	}
	public int add() {
		return service.inputX()+service.inputY();
	}
}
