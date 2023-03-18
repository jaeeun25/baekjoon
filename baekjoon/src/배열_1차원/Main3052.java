package 배열_1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3052 {
	// 백준 3052번: 나머지
	// HashSet 이용 가능 -> 중복을 허용하지 않으니 나머지 값들을 넣으면 중복 값은 자동 제거됨. 마지막에 size출력하면 정답 출력됨
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[42];	// 0~ 41 나머지값이 인덱스가 된다.
		int count = 0, n;
		
		for(int i=0; i<10; i++) {
			n = Integer.parseInt(br.readLine());
			
			if(!arr[n%42]){
				arr[n%42] = true;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
