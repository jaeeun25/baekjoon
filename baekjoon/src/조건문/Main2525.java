package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2525 {
	// 백준 2525번: 오븐 시계
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		// 더 간략한 코드
		int min = 60*h+m;	// 분
		min += time;
		
		h = (min / 60) % 24;
		m = min %60;		
		
		/* 내가 푼 방법
		int t_h = time/60;
		int t_m = time%60;
		
		h += t_h;
		m += t_m;
		
		if(m >= 60) {
			h += m/60;
			m %= 60;
		}
		
		if(h >= 24) {
			h %= 24;
		}
		*/
		
		System.out.println(h+" "+m);
		
		br.close();
	}
}
