package Test5;

public class TestArray {
	
	static void changeArray(int arr[]){
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			} else if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
	}
	
}
