package 약수_배수_소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main13241 {
	// 백준 13241번: 최소공배수
	// 입력이 long
	// 유클리드 호제법 이용
	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			long d = gcd(a, b);
			
			System.out.println(a*b/d);

			br.close();
	}
	
	
	public static long gcd(long a, long b) {
		
		while(b != 0) {
			long r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
}
