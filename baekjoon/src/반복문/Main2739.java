package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2739 {
	// 백준 2739번: 구구단
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<10; i++) {
			sb.append(n+" * "+i+" = "+(n*i)).append('\n');
		}
		
		System.out.print(sb);
		
		br.close();
	}
}
