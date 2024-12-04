package Test4;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. int arr[] = {3, 5, 1, 8, 2}	 
//		위 배열에서 홀수들의 합과 짝수들이 합의 차이를 구하시오.
		int arr[] = {3, 5, 1, 8, 2};
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				oddSum += arr[i];
			} else {
				evenSum += arr[i];
			}
		}
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);
		System.out.println(oddSum - evenSum);
	}

}
