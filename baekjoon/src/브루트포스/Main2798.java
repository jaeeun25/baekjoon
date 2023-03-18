package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2798 {
	// 백준 2798번: 블랙잭
	// 브루트포스 카테고리 문제 -> 무차별적으로 대입해보는 방법으로 모든 경우의 수를 대입해 만족하는 값 찾는 것이 특징인 알고르짐
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		int sum = 0, max = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		
		for(int i=n-1; i>=0; i--) {
			for(int j=i-1; j>=0; j--) {
				for(int k=j-1; k>=0; k--) {
					sum = card[i] + card[j] + card[k];
					if(sum <= m && max < sum ) {
						max = sum;
					}
				}
			}
			
		}
		System.out.println(max);
	}
}
