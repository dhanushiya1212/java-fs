package Day3;

public class Single_Inherit extends Parent {
	public static void main(String[] args) {
		add();
		System.out.println(a);
	}
}
class Parent{
	public static int a = 10;
	public static int b = 20;
	static int add() {
		return a+b;
		
	}
}