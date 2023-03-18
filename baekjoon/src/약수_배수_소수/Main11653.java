package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11653 {
	// 백준 11653번: 소인수분해
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int i = 2;
		
		while(true) {
			if(n == 1 || n == 0) break;
			if(n % i == 0) {
				n /= i;
				System.out.println(i);
			}
			else {
				i++;
			}
		}
				
		br.close();
	}
}
