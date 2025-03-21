package Day3;

public class Multilevel extends Parent {
	public static void main(String args[]) {
		 add();
		System.out.println(a+b);
		
	}

}
class parent1 extends Multilevel{
	static int a=20;
    static int b=10;
    static int add() {
    	return a+b;
    }
}
class parent2 extends parent1 {
	static int a=20;
	static int b=10;
	static int sub() {
		return a-b;
		
	}
}
class parent3{
	static int a=20;
    static int b=10;
    static int mul() {
    	return a*b;
	
}}