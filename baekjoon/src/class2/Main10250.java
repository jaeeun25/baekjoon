package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {
	// 백준 10250번: ACM 호텔
	// 층 -> (n%h)*100 값	(나머지 값이 0인경우는 h가 배정받은 층, 최소 100의 자릿수부터 시작하므로 100을 곱해줌)
	// 호수 -> (n/h)+1값	(n과 h가 같다면 +1은 하지 않는다. 호수는 1호부터 시작하므로)
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int h, w, n;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			h = Integer.parseInt(st.nextToken());	// 층
			w = Integer.parseInt(st.nextToken());	// 방
			n = Integer.parseInt(st.nextToken());	// 손님			
			
			for(int j=1; j<=w; j++) {
				if(n <= h) {
					sb.append(n).append(j < 10 ? "0" + j : j).append('\n');
					break;
				}
				else {
					n = n-h;
				}
			}
			
			/*
			 if(n%h == 0){
			 	sb.apped((h*100) + (n/h)).append('\n');
			 }
			 else {
			 	sb.append(((n % h) * 100) + ((n / h) + 1)).append('\n');
			 }
			 */
		}
		
		System.out.print(sb);
		
		br.close();
	}
}
