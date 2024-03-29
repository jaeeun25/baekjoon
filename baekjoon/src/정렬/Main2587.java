package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2587 {
	// 백준 2587번: 대표값2
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int avg = 0;
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
		}
		Arrays.sort(arr);
		
		System.out.print(avg/5 + "\n" + arr[2]);
		
		br.close();
	}
}
