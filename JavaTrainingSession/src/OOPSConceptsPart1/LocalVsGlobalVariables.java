package OOPSConceptsPart1;

public class LocalVsGlobalVariables {
	//Global vars: ---->class variables
	String name="David";
	int age=25;
	public static void main(String[] args) {
		int i=10;//local var for main method
		System.out.println(i);
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	public void sum() {
		int i=15;//local var for sum method
		int j=20;
	}

}
