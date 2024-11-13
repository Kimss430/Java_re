package Test;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum 함수를 호출한 결과를 출력
		Calc calc = new Calc();
		int sum = calc.sum(1, 2);
		System.out.println(sum);
		
		int arr[] = {1, 3, 5, 2, 4};
		int arrSum = calc.arraySum(arr);
		System.out.println(arrSum); //15
	}
	
}
