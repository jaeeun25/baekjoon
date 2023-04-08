package 반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11021 {
	// 백준 11021반" A+B - 7
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			sb.append("Case #" + (i+1) + ": ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');
		}
		 
		System.out.print(sb);

		br.close();
	}
}
