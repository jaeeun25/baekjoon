package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10951 {
	// 백준 10951번: A+B - 4
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st;
		String str;
		int a, b;
		while((str=br.readLine())!= null){	
			st = new StringTokenizer(str, " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			System.out.println(a+b);
		}
		
		br.close();
	}
}
