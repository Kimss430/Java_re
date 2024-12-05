package Test6;

public class ArrayUtil {

	public static int[] concat(int[] array1, int[] array2) {
		int[] result = new int[array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++) {
			result[i] = array1[i];
		}
		for(int i = 0; i < array2.length; i++) {
			result[array1.length + i] = array2[i];
		}
		return result;
	}
	
//	static void print(int[] array) {
//		for(int i =0; i < array.length; i++) {
//			System.out.println(array[i]);			
//		}
//	}	
}
