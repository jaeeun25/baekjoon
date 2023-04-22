package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main13909 {
	// 백준 13909번: 창문 닫기
	// 열린 창문은 약수의 개수가 홀수인 수 -> 제곱근
	// 그러므로 n이 제곱근일 때 열려있는 창문 개수가 증가한다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 1;	// 첫번째 창문은 항상 열려있음
		
		for(int i=2; i*i<=n; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
	
		br.close();
	}
}
