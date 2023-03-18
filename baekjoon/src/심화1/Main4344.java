package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4344 {
	// 4344번: 평균은 넘겠지
	// sum 변수 선언 대신 평균 계산 시 Arrays.stream(score).sum() 사용 가능
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		String str = "";
		StringTokenizer st;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int cnt = 0, sum = 0, n = 0, result = 0;
			int[] score = null;
			while(st.hasMoreTokens()) {
				if(cnt == 0) {
					n = Integer.parseInt(st.nextToken());
					score = new int[n];
				}
				else {
					score[cnt-1] = Integer.parseInt(st.nextToken());
					sum += score[cnt-1];
				}
				cnt++;
			}
			
			double avg = sum / (double)n;
			
			for(int s : score) {
				if(s > avg) {
					result++;
				}
			}
			str += String.format("%.3f", ((result/(double)n)*100)) + "%\n";
		}
		System.out.println(str);
		
		br.close();

	}
}
