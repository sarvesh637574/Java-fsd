package practiceproject4;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[4];
        try 
        {
            array[7] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }

	}

}
