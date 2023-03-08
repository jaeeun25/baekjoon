package bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24265 {
	// 백준 24265번: 알고리즘 수업 - 알고리즘의 수행 시간 4
	// 첫번째 출력은 등차가 1인 등차수열의 합을 구하면 됨 -> n*(n-1)/2

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		if(n%2==0) System.out.println((n/2)*(n-1));
		else System.out.println((n/2)*n);
		System.out.println(2);
		
		br.close();
	}
}
