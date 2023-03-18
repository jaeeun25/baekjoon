package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1157 {
	// 백준 1157번: 단어 공부
	// System.in.read()도 사용 가능. 문자열만 받기때문에 입력과 동시에 byte로 반환해 원소 증가 시키는 방법
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		s = s.toUpperCase();
		
		int[] alpa = new int[26];
		for(int i = 0; i<s.length(); i++) {
			alpa[s.charAt(i) - 'A']++;
		}

		int max = Integer.MIN_VALUE;
		int c = 0;
		
		for(int j = 0; j < 26; j++) {
			if(alpa[j] > max) {
				max = alpa[j];
				c = 'A' + j;
			}
			else if(alpa[j] == max) {
				c = '?';
			}
		}
		
		System.out.println((char) c);
		
		br.close();

	}
}
