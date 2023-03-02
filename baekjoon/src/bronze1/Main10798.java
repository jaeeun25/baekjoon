package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10798 {
	// 백준 10798번: 세로읽기
	// 빈칸인지 확인하기 위해 '\0' 사용. null이나, ''은 안됨
	// toCharArray()로 했더니 안됨 -> 배열 크기가 글자수에 딱 맞게 줄어든다.
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] words = new char[5][15];
		String s;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			s = br.readLine();
			for(int j=0; j<s.length(); j++) 
				words[i][j] = s.charAt(j);
			max = max < words[i].length? words[i].length : max;
		}
		
		s = "";
		for(int i=0; i<max; i++){
			for(int j=0; j<5; j++) {
				if(words[j][i] == '\0') {
					continue;
				}
				s += words[j][i];
			}
		}
		  
		bw.write(s);
		 
		br.close();
		bw.flush();
		bw.close();
	}
}