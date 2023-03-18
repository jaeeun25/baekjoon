package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2675 {
	// 백준 2675번: 문자열 반복
	// charAt(), getBytes()를 사용해서도 가능 - 이 경우 for문 3번 중첩
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int m = Integer.parseInt(st.nextToken());
			String[]str = st.nextToken().split("");
			
			for(int j=0; j<str.length; j++) {
				sb.append(str[j].repeat(m));
			}
			sb.append('\n');
		}
		System.out.print(sb);
		br.close();
	}
}
