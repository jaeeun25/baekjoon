package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1259 {
	// 백준 1259번: 팰린드롬수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		while(true) {
			String str = br.readLine();
			n = str.length();
			if(str.equals("0")) break;
			else if(n == 1) {
				sb.append("yes").append('\n');		// 입력된 수가 한자리 수일 때 
				continue;
			}
			
			for(int i=0; i<n/2; i++) {
				if(str.charAt(i) != str.charAt(n-(i+1))) {
					sb.append("no").append('\n');
					break;
				}
				else if(i == (n/2)-1) sb.append("yes").append('\n');
			}
		}
		System.out.print(sb);
		br.close();
	}
}
