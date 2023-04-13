package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1934 {
	// 백준 1934번: 최소공배수
	// 유클리드 호제법 사용 -> 유클리드 호제법으로 최대공약수 구한 후 두 수의 곱을 최대 공약수로 나누면 최소 공배수
	// 유클리드 호제법 -> 2개의 자연수의 최대공약수(GCD)를 구하는 알고리즘
	// r = a%b이며, a와 b의 최대공약수를 (a, b)라고 할 때 (a, b)의 최대공약수는 (b, r)의 최대공약수와 같다. -> GCD(a,b) = GCD(b,r)
	// r = 0이면(즉 나머지가 0일 때까지), 그때 b가 최대공약수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		
		// 유클리드 호제법으로 풀이
		int a, b;
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			int d = gcd(a, b);		// 최대공약수 구하기
			
			sb.append(a*b/d).append('\n');	// 두 수의 곱을 최대공약수로 나눔 -> 최소공배수
		}

		/* 내 풀이 (b에 1부터 순차적으로 곱해 그 값과 a를 나눴을 때 0일 때 곱한 그 값이 최대공약수
		int a, b, cnt;
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			cnt = 1;
			while(true) {
				if((b*cnt)%a == 0) {
					break;
				}
				cnt++;
			}
			
			sb.append(b*cnt).append('\n');
		}
		*/
		System.out.print(sb);
		br.close();
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {	// 즉, r이 0이면 stop
			int r = a%b;
			
			// gcd(a,b) = gcd(b,r)
			a = b;
			b = r;
		}
		return a;		// b가 0일때 a 값(즉, 최대공약수)
	}
}
