package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1193 {
	// 백준 1193: 분수 찾기
	// 입력받은 번호가 몇번째 라인에 속하는지, 짝수 라인인지 홀수 라인인지를 알아내야 한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int line = 1;
		int x=0, y=0;
		
		while(true) {
			if(n <= line*(line+1)/2) {
				if(line%2 == 0) {
					x = n - (line*(line-1)/2);	// line*(line-1)/2 -> 아래층까지의 분수들 개수
					y = line + 1 - x;
				}
				else {
					y = n - (line*(line-1)/2);
					x = line + 1 - y;
				}
				break;
			}
			
			line++;
		}
		
		System.out.println(x + "/" + y);
		
		br.close();
		
		/* 다른방법
		 while(x > line){
		 	x -= line;
		 	line++;
		 }
		 */
	}
}
