package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main19532 {
	// 백준 19532번: 수학은 비대면강의입니다
	// 완전탐색
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int result = 0;
		
		for(int x=-999; x<1000; x++) {
			for(int y=-999; y<1000; y++) {
				if(a*x+b*y == c && d*x+e*y == f) {
					System.out.println(x + " " + y);
					return;
				}
			}
		}
	}
}
