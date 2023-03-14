package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8958 {
	// 백준 8958번: OX퀴즈
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int sum,  cnt;
		
		for(int i=0; i<n; i++) {
			String[] arr = br.readLine().split("");
			sum = 0;
			cnt = 1;
			
			for(String a : arr) {
				if(a.equals("O")) {
					sum += cnt++;
				}
				else cnt = 1;
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}
}