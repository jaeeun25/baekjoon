package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10988 {
	// 백준 10988번: 팰린드롬인지 확인하기
	// reverse()로 문자 역순으로 뒤집고 기존 문자열과 동일한지 검사해서 문제 풀이 가능
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder sb = new StringBuilder(br.readLine());
		String str = br.readLine();
		int n = str.length();
		int flag = 1;

		for(int i=0; i<=n/2; i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				flag = 0;
				break;
			}
		}
		
		System.out.println(flag);
		//System.out.println(((sb.toString().equals(sb.reverse().toString()))) ? 1 : 0);
		
		br.close();
	}
}
