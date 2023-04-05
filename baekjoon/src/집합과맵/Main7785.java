package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main7785 {
	// 백준 7785번: 회사에 있는 사람
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<String> names = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		HashMap<String, String> log = new HashMap<String, String>();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			log.put(st.nextToken(), st.nextToken());
		}

		for(String s : log.keySet()) {
			if(log.get(s).equals("leave")) continue;
			else {
				names.add(s);
			}
		}
		Object[] str = names.toArray();
		Arrays.sort(str);
	
		for(int i=str.length-1; i>=0; i--) {
			sb.append(str[i]).append('\n');
		}
		
		
		System.out.print(sb);
		br.close();
	}
}
