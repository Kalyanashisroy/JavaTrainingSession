package OOPSConceptsPart1;

public class Car {
	//class vars:
	int mod;
	int wheel;
	public static void main(String[] args) {
		//new car():this is the object of car class
		//new keyword is used to create the object
		//a,b,c------> object reference variables
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.mod=2015;
		a.wheel=4;
		b.mod=2020;
		b.wheel=6;
		c.mod=2568;
		c.wheel=8;
		
		System.out.println("Before assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);//10
		c.mod=20;
		System.out.println(a.mod);//20
		System.out.println(c.mod);
		
	}

}
