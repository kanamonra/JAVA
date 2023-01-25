package FirstEx0125;

public class FirstEx0125 {

	public static void main(String[] args) {
		// way to print
		int a = 5 ;
		System.out.println("HELLO, JAVA.");
		System.out.println("INHA");
		System.out.printf("DecimalNum = %d\n" ,  7);
		System.out.printf("a = %d\n" , a);
		
		// Printing both float and double type data 
		// Other way to give data in to float type 
		// float fv =  6.28f ;
		
		float fv =  (float) 6.28;
		double dv = 3.14 ;
		// System.out.printf("fv = %d and dv = %f\n", fv, dv);
		System.out.printf("fv = %07.2f and dv = %07.2e\n", fv, dv);
		System.out.printf("fv = " + fv + "\n");
		System.out.printf("fv = %.2f\n ", fv);
		System.out.printf("fv = %7.2f\n and\n dv = %7.1e\n", fv, dv);
		System.out.printf("fv = %-7.2f\n and dv = %7.2e\n", fv, dv);
		
		// double printing
		System.out.printf("dv = %.2e\n", dv);
		char ch = 'A' ;
		String f = "This is an demo version of java practice";
		String c = "Computer: ";
		System.out.println(f);
		System.out.printf("ch = %c\n",  ch);
		// System.out.printf("ch = %g\n", (int)(char));
		System.out.println(ch);
		System.out.printf("c = %s\n", f);
	}
}
