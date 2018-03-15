package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	public int div(int a, int b){
		if(b==0) {
			return 0;
		}
		return a/b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int abs(int a) {
		int aa=0;
		if (a>=0) {
			aa=a;
		}
		else {
			aa=-a;
		}
		return aa;
	}
}
