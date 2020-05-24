package OOPSConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(12.35);
		obj.sum(10, 20);
		
	}
	public static void main(int p) {
		
	}
	public static void main(int q,int h) {
		
	}
	//we can overload main method also
	//you can not create method inside a method
	//duplicate method: i.e same method name with same number of argument are not allowed(data type same also not allowed)
	//method overloading-->when the method name is same with different arguments(they are having different data type) or input parameters with in the same class
	
	public void sum() {
		System.out.println("sum method ------zero param");
	}
	public void sum(double d) {
		System.out.println("sum method-----1 param");
		System.out.println(d);
		
	}
	public void sum(int i) {
		System.out.println("sum method ------1 param");
		System.out.println(i);
	}
	public void sum(int i,int j) {
		System.out.println("sum method ------2 param");
		System.out.println(i+j);
		
	}

}
