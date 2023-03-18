package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1316 {
	// 백준 1316번: 그룹 단어 체커
	// 알파벳 배열 만들어서 체크
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int idx = 0, prev = 0, cnt = 0;
		String s;
		
		boolean[] alpa = new boolean[26];
		
		str: for(int i=0; i<n; i++) {
			s = br.readLine();
			Arrays.fill(alpa, false);
			for(int j=0; j<s.length(); j++) {
				idx = s.charAt(j) - 'a';
				
				if(!alpa[idx]) {
					alpa[idx] = true;
					prev = idx;
				}
				else {
					if(prev == idx) continue;
					continue str;
				}
			}
			
			cnt++;
		}

		System.out.println(cnt);
		
		br.close();
	}
}
