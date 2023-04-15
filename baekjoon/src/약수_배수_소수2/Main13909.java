package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13909 {
	// 백준 13909번: 창문 닫기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean[] window = new boolean[n];	// 0번은 무의미
			
		int j=1, idx=0;
		for(int i=2; i<=n; i++) {
			idx = i*(j++);
			while(idx <= n) {
				window[idx-1] = !window[idx-1] ? true : false;
			}	
		}
		
		int cnt=0;
		for(boolean b : window) {
			if(!b) cnt++; 
		}
		
		System.out.println(cnt);
	
		br.close();
	}
}
