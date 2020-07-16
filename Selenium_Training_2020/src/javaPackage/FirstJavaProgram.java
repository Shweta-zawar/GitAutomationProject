package javaPackage;

public class FirstJavaProgram {
    static int a = 5 ;
    int y =1 ;
	public static void main(String[] args) {
		System.out.println("Shweta Kalantri");
		FirstJavaProgram s1 = new FirstJavaProgram();
		a();
		s1.b();
		System.out.println("Statement from Main after a and b methods");
	}
	
	public static void a() {
		
		a = 10;
		System.out.println("a Method called : " + a);
	}
	
	public void b() {
		
		a = 15;
		System.out.println("Statement from method b is executed");
		System.out.println("Value of a in Method b : " + a);
		a();
		
	}

}
