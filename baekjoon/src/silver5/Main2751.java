package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2751 {
	// 백준 2751번: 수 정렬하기 2
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 중복이 없다고 했으므로 boolean으로 체크
		// 음수도 들어옴 -> 인덱스 0은 1000000번
		boolean[] arr = new boolean[2000001];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]) {
				sb.append((i-1000000)).append('\n');
			}
		}
		System.out.println(sb);
		br.close();
	}
}	
