package Test;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 1, 5, 4, 3};
			
		// 배열에서 가장 큰 숫자를 출력
		
		int max = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

		// 배열에서 가장 큰 숫자의 위치(index) 값을 출력
		
		int maxIndex = 0;
		for(int j=0; j<arr.length; j++) {
			if(arr[maxIndex] < arr[j]) {
				maxIndex = j;
			}
		}
		System.out.println(maxIndex);
	}

}
