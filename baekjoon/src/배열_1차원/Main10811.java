package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10811 {
	// 백준 10811번: 바구니 뒤집기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			for(int j=a; j<=b; j++) {
				int temp = arr[j];
				arr[j] = arr[b];
				arr[b--] = temp;
			}
			/*
			for(int j=0; j<b-a; j++) {
				for(int k=a; k<b-j; k++) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
			*/
		}
		
		for(int i : arr) {
			sb.append(i + " ");
		}
		
		System.out.print(sb);
		
		br.close();
	}
}
