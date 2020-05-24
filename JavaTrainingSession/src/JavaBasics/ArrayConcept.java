package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//array: to store similar data type in a variable
		//1.int array
		//lowest bound/index=0
		//upper bound/index=n-1(n is size of array)
		//one dim array
		//dis advantage of array
		//1.size is fixed--static array--to overcome this problem--we use collection--array list,hashtable-use dynamic array
		//2.stores only similar data types--to overcome this problem we use object array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);//arrayindexoutofboundsexception
		System.out.println(i.length);//size/length of array
		
		//print all the value of array:use for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		//2.double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.55;
		d[2]=15.33;
		System.out.println(d[2]);
		
		//3.char array
		char c[]=new char[3];
		c[0]='4';
		c[1]='3';
		c[2]='5';
		//4.boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		//5.string array
		String s[]=new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s.length);
		System.out.println(s[1]);
		//6.object array:object is class--is used to store different data types values
		Object obj[]=new Object[6];
		obj[0]="Mike";
		obj[1]=12;
		obj[2]=12.33;
		obj[3]="01/01/2020";
		obj[4]="w";
		obj[5]="London";
		System.out.println(obj[5]);
		System.out.println(obj.length);
		
		
	}

}
