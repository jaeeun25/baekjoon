package 약수_배수_소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5086 {
	// 백준 5086번: 배수와 약수
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int a=-1, b=-1;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) break;
			
			if(a%b==0) 
				sb.append("multiple").append('\n');
			else if(b%a==0) 
				sb.append("factor").append('\n');	
			else 
				sb.append("neither").append('\n');	
		}
		
		System.out.print(sb);
		
		br.close();
	}
}
