package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978 {
	// 백준 1978번: 소수 찾기
	// Math.sqrt(x) -> 제곱근 구하는 함수  		// x의 제곱근 보다 크지 않은 어떤 수로 나눠도 나누어지지 않으면 소수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x, cnt = n;
		while(st.hasMoreTokens()) {
			x = Integer.parseInt(st.nextToken());
			if(x == 1) {
				cnt--;
				continue;
			}
			//for(int i=2; i<x; i++) 		// 내가 쓴 코드
			for(int i=2; i<=Math.sqrt(x); i++) {
				if(x%i == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}
}