package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9020 {
	// 백준 9020번: 골드바흐의 추측
	
	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		boolean[] primeArr = new boolean[10001];
		
		isPrime(primeArr);
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int j = 2, x = 0, y = 0;
			int min = Integer.MAX_VALUE;
			while(true) {
				if(n/2 <= j-2) break;		// n/2이상은 앞 뒤 수가 바뀐채로 반복 되기때문에 n/2까지만 반복한다.
				else if(!primeArr[j] && !primeArr[Math.abs(n-j)]) {		// j가 소수 && n-j가 소수인 경우
					if(min>Math.abs(n-2*j)) {	// 두 소수의 차가 min보다 작은 경우
						min = n-2*j;
						x = j;
						y = n-j;
					}
				}
				j++;
			}
			System.out.print(x + " " + y + "\n");
		}
		br.close();
	}
	
	// 에라토스테네스 체 알고리즘
	public static void isPrime(boolean[] primeArr) {
		primeArr[0] = true;
		primeArr[1] = true;
		
		for(int i=2; i<Math.sqrt(primeArr.length); i++) {
			if(primeArr[i]) continue;
			for(int j = i*i; j<primeArr.length; j += i) {
				primeArr[j] = true;
			}
		}
	}
}
