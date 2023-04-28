package 배열_2차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2566 {
	// 백준 2566번: 최댓값
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] arr = new int[9][9];
		int max = Integer.MIN_VALUE;
		int idx_x = 0, idx_y = 0;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<9; j++) {
				int n = Integer.parseInt(st.nextToken());
				arr[i][j] = n;
				
				if(max < n) {
					max = n;
					idx_x = i;
					idx_y = j;
				}
			}
		}
		
		System.out.print(max+"\n"+(idx_x+1)+" "+(idx_y+1));
		
		br.close();
	}
}
