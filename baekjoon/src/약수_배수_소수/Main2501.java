package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2501 {
	// 백준 2501번: 약수 구하기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i=2; i<=n; i++) {
			if(n%i==0) {
				k--;
			}
			if(k == 0) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(0);		// k보다 약수의 갯수가 적으면 0출력
		
		br.close();
	}
}
