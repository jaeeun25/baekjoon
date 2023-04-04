package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25314 {
	// 백준 25314번: 코딩은 체육과목 입니다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n/4; i++) {
			sb.append("long ");
		}
		sb.append("int");
		
		System.out.print(sb);
		
		br.close();
	}
}
