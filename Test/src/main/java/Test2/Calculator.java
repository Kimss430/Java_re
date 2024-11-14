package Test2;

public class Calculator implements CalcInterface {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int addArr(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	@Override
	public Student studentInfo(String name, int age, String addr, String stuNo) {
		// TODO Auto-generated method stub
		Student stu = new Student(stuNo, age, stuNo, stuNo);
		return stu;
	}

	@Override
	public int[] changeArr(int[] arr) {
		// TODO Auto-generated method stub
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			} else if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;

		return arr;
	}

}
