package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920 {
	// 백준 2920번: 음계
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int i = 0;
		
		int first = Integer.parseInt(st.nextToken());
		if(first == 8) {
			for(i=7; i>0; i--) {
				if(Integer.parseInt(st.nextToken()) != i)
					break;
			}
		}
		else if(first == 1) {
			for(i=2; i<9; i++) {
				if(Integer.parseInt(st.nextToken()) != i)
					break;
			}
		}
		
		if(first == 1 && i == 9) System.out.println("ascending");
		else if(first == 8 && i == 0) System.out.println("descending");
		else System.out.println("mixed");
	}
}
