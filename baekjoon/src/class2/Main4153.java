package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4153 {
	// 백준 4153번: 직각삼각형
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a, b, c, max, x, y;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			a = max = Integer.parseInt(st.nextToken());
			if(a==0) break;
			
			b = x = Integer.parseInt(st.nextToken());
			c = y = Integer.parseInt(st.nextToken());
			
			if(max < b) {
				max = b;
				x = a;
				y = c;
			}
			if(max < c) {
				max = c;
				x = a;
				y = b;
			}
			if((max*max) == ((x*x)+(y*y))) {
				sb.append("right").append('\n');
			}
			else {
				sb.append("wrong").append('\n');
			}
		}
		
		System.out.print(sb);
		br.close();
	}
}
