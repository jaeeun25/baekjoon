package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24267 {
	// 백준 24267번: 알고리즘 수업 - 알고리즘의 수행 시간 6
	// for문 n-2, n-1, n까지 수행하고 i+1, j+1을 고려해 식 도출
	// --> 최종식은 (n-1)(n-2)(2n-3)+3(n-1)(n-2)/12으로 간략히 하면 n(n-1)(n-2)/6
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println((n*(n-2)*(n-1))/6);
		System.out.println(3);
		
		br.close();
	}
}