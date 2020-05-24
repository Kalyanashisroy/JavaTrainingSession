package OOPSConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		//data conversion string to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		//Integer, double,character ,boolean
		//String to double conversion
		String y="22.33";
		double d=Double.parseDouble(y);
		System.out.println(d);
		//String to boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		//int to string conversion
		int j=200;
		System.out.println(j+20);
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		String u="200T";
		Integer.parseInt(u);//numberformatexception-- for input string--"200T"
	}

}
