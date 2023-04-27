package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3003 {
	// 백준 3003번: 킹, 퀸, 룩, 비숍, 나이트, 폰
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] arr = {1,1,2,2,2,8};
		
		for(int i=0; i<6; i++) {
			int p = Integer.parseInt(st.nextToken());
			
			arr[i] -= p;
			
			sb.append(arr[i]+" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
