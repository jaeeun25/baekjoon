package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2475{
	// 백준 2475번: 검증수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n, result = 0;
		
		for(int i=0; i<5; i++) {
			n = Integer.parseInt(st.nextToken());
			result += n*n;
		}
		
		System.out.println(result%10);
		
		br.close();
	}
}
