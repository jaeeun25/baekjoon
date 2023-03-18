package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9506 {
	// 백준 9506번: 약수들의 합
	// String Builder 이용해 주로 품.
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0, result;
		String str = null, str2;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			result = 1;
			str2 = "";
			
			if(n == -1) break;
			
			for(int i=2; i<n; i++) {
				if(n % i == 0) {
					result += i;
					str2 += " + " + i;
				}
			}
			if(n == result) str = n + " = 1" + str2;
			else str = n + " is NOT perfect.";
			
			System.out.println(str);
		}
		
		br.close();
		
	}

}
