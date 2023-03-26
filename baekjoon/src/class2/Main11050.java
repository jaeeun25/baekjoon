package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11050 {
	// 백준 11050번: 이항 계수1
	// 동적계획법을 이용해 풀이 가능
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(bc(n)/(bc(k)*bc(n-k)));
		//System.out.println(bc(n, k));		2번 메소드 이용
	
		br.readLine();
	}
	
	public static int bc(int n) {
		if(n <= 1) return 1;
		else return n*bc(n-1);
	}
	
	/*
	// 2. 이항계수 성질 이용해 하나의 식으로 표현
	public static int bc(int n, int k) {
		if(n == k || k == 1) {
			return 1;
		}
		return bc(n-1, k-1) + bc(n-1, k);
	}
	*/
}
