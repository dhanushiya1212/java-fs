package Day3;

public class Hierarchical {
	public static void main(String args[]) {
		Child1 x=new Child1();
		Child2 z=new Child2();
		x.access();
		z.access();
		
		
		}

}
class Parent2 {
	int i=10,j=20;
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	
}
class Child1 extends Parent2 {
	int i=2,j=10;
	public void access() {
		Parent2 inp=new Parent2();
		inp.add(i,j);
	}
}
class Child2 extends Parent2 {
	int i=4,j=8;
	public void access() {
		Parent2 inp=new Parent2();
		inp.add(i,j);
		
	
}

	
}

