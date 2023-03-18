package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2562 {
	// 백준 2562번: 최댓값
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0, max = Integer.MIN_VALUE, n = 0;
		for(int i=0; i<9; i++) {
			 n = Integer.parseInt(br.readLine());
			 
			 if(max < n) {
				 max = n;
				 cnt = i+1;
			 }
		}
		
		System.out.println(max + "\n" + cnt);
	}
}