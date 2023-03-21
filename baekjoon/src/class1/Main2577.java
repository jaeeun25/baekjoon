package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2577 {
	// 백준 2577번: 숫자의 개수
	// 몫과 나머지 연산으로도 풀 수 있다
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int sum = 1;
		int cnt[] = new int[10];
		for(int i=0; i<3; i++) {
			sum *= Integer.parseInt(br.readLine());
		}
		
		String s = String.valueOf(sum);
		for(int i=0; i<s.length(); i++) {
			cnt[s.charAt(i) - '0']++;
		}
		
		for(int c : cnt) {
			sb.append(c).append('\n');
		}
		
		System.out.print(sb); 	
		br.close();
	}
}
