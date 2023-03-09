package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main24313 {
	// 백준 24313번: 알고리즘 수업 - 점근적 표기 1
	// a1*n + a0 <= c*n 해당 조건을 만족해야 하므로 a1 > c일시 크면 조건 불만족
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		int result = 1;
		
		if((a1 * n0 + a0 > (n0 * c)) || (a1 > c)) result = 0;
		
		System.out.println(result);
		
		br.close();
	}
}
