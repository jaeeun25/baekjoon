package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1546 {
	// 백준 1546번: 평균
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0, max = Integer.MIN_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			int score = Integer.parseInt(st.nextToken());
			if(max < score) max = score;
			sum += score;
		}
		
		float avg = (sum/(float)max*100) / (float) n;
		System.out.println(avg);
		
		br.close();
		
	}
}
