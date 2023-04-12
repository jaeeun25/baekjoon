package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11382 {
	// 백준 11382번: 꼬마 정민
	// 숫자 범위가 있기 때문에 int형으로는 런타임 에러가 발생. long형으로 문제를 풀 것
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		long sum = Long.parseLong(st.nextToken()) +
					Long.parseLong(st.nextToken()) +
					Long.parseLong(st.nextToken());
		/*
		long sum = 0;
		for(int i=0; i<3; i++) {
			sum += Long.parseLong(st.nextToken());
		}
		*/
		
		System.out.println(sum);
		
		br.close();
	}
}
