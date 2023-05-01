package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9498 {
	// 백준 9498번: 시험 성적
	// 삼항연산자로 한줄로 작성 가능
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 90) 
			sb.append('A');
		else if(score >= 80) 
			sb.append('B');
		else if(score >= 70) 
			sb.append('C');
		else if(score >= 60) 
			sb.append('D');
		else 
			sb.append('F');
		
		System.out.println(sb);
		
		br.close();
	}
}
