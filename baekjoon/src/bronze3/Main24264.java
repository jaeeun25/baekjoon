package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24264 {
	// 백준 24264번: 알고리즘 수업 - 알고리즘의 수행 시간 3
	// int로 받으면 틀림. n*n 값이 올바르지않음.
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int n = Integer.parseInt(br.readLine());
		long n = Long.parseLong(br.readLine());
		System.out.println(n);
		System.out.println(n*n + "\n" + 2);
		
		br.close();
	}
}
