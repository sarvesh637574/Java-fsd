package practiceprojects;

public class StringConversionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "Hello, World!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the results
        System.out.println("Original String: " + originalString);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);


	}

}
