package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2941 {
	// 백준 2941번: 크로아티아 알파벳
	// replace이용해 더 간단하게
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String alpa = br.readLine();
		
		char c, prev = 0;
		int cnt = 0;
		boolean flag = false;
		
		for(int i=0; i<alpa.length(); i++) {
			c = alpa.charAt(i);
			if(c == '-' || c == '=') {
				if(flag) {
					cnt--;
				}
				prev = c;
				continue;
			}
			else if(c == 'j') {
				if(prev == 'l' || prev == 'n') {
					prev = c;
					continue;
				}
			}
			else if(c == 'z' && prev == 'd') {
					flag = true;
			}
			else if(flag) {
				flag= false;
			}
			prev = c;
			cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		
		/* 다른 방법
		String alpa = br.readLine();
		
		String s[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0;i<s.length;i++)
			if(alpa.contains(s[i]))
				alpa=alpa.replace(s[i], "0");
		
		bw.write(String.valueOf(alpa.length()));
		*/

		br.close();
		bw.flush();
		bw.close();
	}
}
