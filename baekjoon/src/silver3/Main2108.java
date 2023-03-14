package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main2108 {
	// 백준 2108번: 통계학
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] cnt = new int[8001];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			cnt[i+4000]++;
		}
		

		// 산술평균
		sb.append(Arrays.stream(arr).sum()/n).append('\n');
		
		// 중앙값
		Arrays.sort(arr);
		sb.append(arr[n/2]).append('\n');
		
		// 최빈값
		OptionalInt max = Arrays.stream(cnt).max();
		for(int i=0; i<cnt.length; i++) {
			
		}
		
		// 범위
		sb.append(arr[n-1]-arr[0]);
				
		System.out.print(sb);
		br.close();
	}
}
