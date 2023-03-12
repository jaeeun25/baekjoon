package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10814 {
	// 백준 10841번: 나이순 정렬
	// StringBuilder 배열 만들어서 나이에 해당하는 인덱스에 출력문 넣어서 나중에 순서대로 원소 꺼내는 방법도 있음
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (e1, e2) -> Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]));
		
		for(int i=0; i<n; i++)
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		
		System.out.print(sb);
		br.close();
	}
}
