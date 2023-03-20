package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {
	// 백준 2231번: 분해합
	// for문에서 i의 시작을 (n-(n길이*9)) 로 가능 - 왜..?
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int number = i;
			int sum = 0;		// 각 자릿수 합 변수
			
			while(number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			if(sum + i == n) {		// 생성자를 찾은 경우
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
		br.close();
	}
}
