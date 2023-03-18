package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
	// 백준 2908번: 상수
	// reverse() 메소드 이용해 더 쉽게 풀수 있다. -> String에서 제공하지 않기 때문에 StringBuilder, StringBuffer, Collection클래스를 이용해야한다.
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String[] num = new String[3];
		int max = Integer.MIN_VALUE, value = 0;
		
		for(int i=0; i<2; i++) {
			num = st.nextToken().split("");
			value = Integer.parseInt((num[2] + num[1] + num[0]));
			max = max < value ? value : max;
		}
		
		System.out.println(max);
		
		/*
		// reverse() 사용
		int x = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int y = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(x < y ? x : y);
		*/
	}
}
