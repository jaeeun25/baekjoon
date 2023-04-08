package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10810 {
	// 백준 10810번: 공 넣기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start, end, no;
		int[] arr = new int[n];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			no = Integer.parseInt(st.nextToken());
			for(int j=start-1; j<end; j++) {
				arr[j] = no;
			}
		}
		
		for(int a : arr) {
			sb.append(a + " ");
		}
		
		System.out.print(sb);
		br.close();
	}
}
