package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11022 {
	// 백준 11022번: A+B - 8
	// a,b는 범위는 0이상 10미만이므로(1~9) StringTokenizer말고 배열을 활용해 문제를 풀 수 있다.
	// 배열을 이용하는 경우 a,b가 항상 한자리이므로 공백이 들어가는 위치는 고정되어있어 오히려 StringTokenizer 객체를 생성하지 않아 시간이 더욱 단축될 수 있다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n= Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #"+i+": "+a+" + "+b+" = "+(a+b)).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
