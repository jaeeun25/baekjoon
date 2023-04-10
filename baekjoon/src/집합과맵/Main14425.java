package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main14425 {
	// 백준 14425번: 문자열 집합
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<> ();
		
		for(int i=0; i<n; i++) {
			hs.add(br.readLine());
		}
		
		String str;
		int cnt = 0;
		for(int i=0; i<m; i++) {
			str = br.readLine();
			if(hs.contains(str)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}
