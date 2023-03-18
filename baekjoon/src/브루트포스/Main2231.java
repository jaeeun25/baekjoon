package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {
	// 백준 2231번: 분해합
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		int a=1, c, m = 0;
		String b = "";
		for(int j=0; j<1; j++) {
			for(int i=1; i<n.length(); i++) {
					m += a;
					b += String.valueOf(a);
			}
			m += Integer.parseInt(b);
			if(Integer.parseInt(n) == m) {
				
			}
		}
	}
}
