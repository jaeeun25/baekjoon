package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main1269 {
	// 백준 1269번: 대칭 차집합
	// HashSet을 A, B 두 개다 선언하고 각각 서로에게 같은원소가 있는지 체크하고 없으면 카운트변수 +1 이런 식으로도 풀이 가능
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a_no = Integer.parseInt(st.nextToken());
		int b_no = Integer.parseInt(st.nextToken());
		
		HashSet<String> e = new HashSet<> ();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<a_no; i++) e.add(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<b_no; i++) {
			String b = st.nextToken();
			if(e.contains(b)) e.remove(b);
			else e.add(b);
		}
		
		System.out.println(e.size());
		
		br.close();
	}
}
