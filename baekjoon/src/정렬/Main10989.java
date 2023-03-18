package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main10989 {
	// 백준 10989번: 수 정렬하기3	
	// Arrays.sort()보다 카운팅 정렬을 사용하면 메모리, 시간 둘 다 더 효율적이다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		  
		Arrays.sort(arr); //dual-pivot Quick sort 알고리즘 -> 평균 O(nlogn) / 최악 O(n^2)
		  
		for(int a : arr) bw.write(a + "\n");
		
		/*
		// 카운팅 정렬 사용(더 효율적)
		int[] cnt = new int[10001];		// 수의 범위 -> 0 ~ 10000
		
		for(int i=0; i<n; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<10001; i++) {	// 0은 입력 범위에 없으므로 1부터 시작
			while(cnt[i] > 0) {			// 해당 인덱스 값이 0이 될 때 까지 출력(한 숫자가 여러개 일 경우 여러번 출력해야하기 때문 - 그 횟수가 저장되어 있는 것)
				bw.write(i + "\n");
				cnt[i]--;
			}
		}
		*/	
		br.close();
		bw.flush();
		bw.close();
	}
}
