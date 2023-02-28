package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main25206 {
	// 25206번: 너의 평점은
	// case로 간단히 가능
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		double score = 0, sum = 0, score_sum = 0;
		String alpa = "";
		
		for(int i=0; i<20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			st.nextToken();
			score = Double.parseDouble(st.nextToken());
			
			alpa = st.nextToken();
			if(alpa.equals("P")) continue;
			else {
				score_sum += score;
				if(alpa.contains("+"))  
					sum += score * (('E' - alpa.charAt(0)) + 0.5);
				else if(alpa.contains("0"))
					sum += score * ('E' - alpa.charAt(0));
			}
		}
		
		System.out.println(String.format("%.6f", sum/(score_sum)));
		
	}
}
