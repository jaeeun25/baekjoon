package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1620 {
	// 백준 1620번: 나는야 포켓몬 마스터 이다솜
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		ArrayList<String> poketmon = new ArrayList<String>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 도감 수
		int m = Integer.parseInt(st.nextToken());	// 문제 수
		
		for(int i=1; i<=n; i++) {		// 도감 입력
			poketmon.add(br.readLine());
		}
		
		String q = "";		 // 문제
		for(int i=0; i<m; i++) {
			q = br.readLine();
			
			if(q.charAt(0) >= 49 && q.charAt(0) <= 57 ) {	// 문제 첫글자가 1~9 숫자인 경우
				sb.append(poketmon.get(Integer.parseInt(q)-1)).append('\n');
			}
			else {		// 문제가 포켓몬 이름인 경우
				sb.append(poketmon.indexOf(q)+1).append('\n');
			}
		}
		bw.write(sb + " ");		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
