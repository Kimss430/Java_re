package Test3;

import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
//    	* 다음 배열을 기준으로 문제 풀이해보기
//    	2. 버블 정렬을 이용하여 위 배열을 작은 수에서 큰 수 순으로 정렬
//    	(결과 : {1, 2, 3, 4, 5})
    	int arr[] = {3, 5, 2, 4, 1};

        // 배열의 길이만큼 반복
        for (int i = 0; i < arr.length - 1; i++) {
            // 인접한 요소 비교
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 위치 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
