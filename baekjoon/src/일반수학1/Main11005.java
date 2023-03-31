package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11005 {
	// 백준 11005번: 진법 변환 2
	// 약간의 메모리차이 있고 시간은 동일했음
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int result;
		char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
						'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 
						'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		while(true) {
			result = n%b;
			if(result < 10) sb.insert(0, result);
			else sb.insert(0, alpha[result-10]);
			
			if((n /= b) == 0) break;
		}
		
		/*
		 while(n > 0) {
			result = n%b;
			if(result < 10) sb.insert(0, (char)(result+'0'));
			else sb.insert(0, (char)(result-10+'A'));
			n /= b;
		 }
		*/
		
		System.out.print(sb);
		br.close();
	}
}
