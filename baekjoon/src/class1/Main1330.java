package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1330 {
	// 백준 1330번: 두 수 비교하기
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		if(x > y) System.out.println(">");
		else if(x < y) System.out.println("<");
		else System.out.println("==");
		
		//System.out.println((x>y) ? ">" : ((x<y) ? "<" : "==" ))

		br.close();
	}
}
