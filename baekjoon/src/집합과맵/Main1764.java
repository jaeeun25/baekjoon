package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main1764 {
	// 백준 1764번: 듣보잡
	// ArrayList를 이용해 contains시 시간초과
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<String> names = new HashSet<> ();
		ArrayList<String> new_name = new ArrayList<>();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			names.add(br.readLine());
		}
		
		String str;
		for(int i=0; i<m; i++) {
			str = br.readLine();
			if(names.contains(str)) {
				new_name.add(str);
			}
		}
		
		Collections.sort(new_name);
		
		sb.append(new_name.size());
		for(String s : new_name) {
			sb.append('\n' + s);
		}
		
		System.out.println(sb);
		br.close();
	}
}
