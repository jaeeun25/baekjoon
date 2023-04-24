package 배열_2차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2738 {
	// 백준 2738번: 행렬 덧셈
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n*2][m];
		
		for(int i=0; i<n*2; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sb.append(arr[i][j]+arr[i+n][j]).append(" ");
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
