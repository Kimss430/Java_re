package Test;

public class Calc {
	public int sum(int x, int y) {
		return x+y;
	}

	public int arraySum(int arr[]) {
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
