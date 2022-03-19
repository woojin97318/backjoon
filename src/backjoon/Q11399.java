package backjoon;

import java.util.*;

public class Q11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		// 배열 오름차순 정렬
		int t;
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}

		// 인출 시간 계산
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += (arr[i] * (arr.length - i));
		}

		// 출력
		System.out.println(sum);
	}
}
