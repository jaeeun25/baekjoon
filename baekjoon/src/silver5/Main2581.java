package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {
	// 백준 2581번: 소수
	// 에라토스테네스의 체 알고리즘 사용 가능
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0, min = Integer.MAX_VALUE;
		boolean isPrime;
		
		for(int i = m; i<=n; i++) {
			isPrime = true;
			if(i == 1) continue;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum += i;
				if(min == Integer.MAX_VALUE) min = i;
			}
		}
		
		if(sum != 0) {
			System.out.println(sum + "\n" + min);
		}
		else {
			System.out.println("-1");
		}
		
		br.close();
	}
}

/* 해당 알고리즘이 성능이 좋아 소수관련 문제에 많이 사용한다 함.
	// 에라토스테네스 체 알고리즘 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;	// 이미 체크된 배열일 경우 넘어감
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
*/
