package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2750 {
	// 백준 2750번: 수 정렬하기
	// 카운팅정렬 사용 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2001];
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			arr[num+1000] = true;
		}
		
		for(int i=0; i<2001; i++) {
			if(arr[i]) sb.append(i-1000).append('\n');
		}
		
		System.out.print(sb);
		br.close();
	}
}
