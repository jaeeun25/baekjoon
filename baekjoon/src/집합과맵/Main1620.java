package 집합과맵;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main1620 {
	// 백준 1620번: 나는야 포켓몬 마스터 이다솜
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> poketmon_no = new HashMap<String, Integer>();
		HashMap<Integer, String> poketmon_name = new HashMap<Integer, String>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 도감 수
		int m = Integer.parseInt(st.nextToken());	// 문제 수
		String name;
		for(int i=1; i<=n; i++) {		// 도감 입력
			name = br.readLine();
			poketmon_no.put(name, i);
			poketmon_name.put(i, name);
		}
		String q = "";		 // 문제
		for(int i=0; i<m; i++) {
			q = br.readLine();
			
			if(q.charAt(0) >= 49 && q.charAt(0) <= 57 ) {	// 문제 첫글자가 1~9 숫자인 경우
				sb.append(poketmon_name.get(Integer.parseInt(q))).append('\n');
			}
			else {		// 문제가 포켓몬 이름인 경우
				sb.append(poketmon_no.get(q)).append('\n');
			}
		}
		bw.write(sb + " ");		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
