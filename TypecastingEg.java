package practiceprojects;

public class TypecastingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Implicit Type Casting(Widening)
		int x=10;
		double y=x;
		System.out.println("Implicit Type Casting(Widening):"+y);
		
//		Explicit Type casting (Narrowing)
		double z=15.50;
		int w=(int)z;
		System.out.println("Explicit Type casting (Narrowing):"+w);
		

	}

}
