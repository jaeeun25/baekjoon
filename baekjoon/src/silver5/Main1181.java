package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1181 {
	// 백준 1181번: 단어 정렬
	// 배열로 할 경우 단어 길이가 같으면 e1.compareTo(e2) 값 리턴
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		List<String> str = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			if(!str.contains(s)) {
				str.add(s);
			}
		}

		str.sort((e1, e2) -> {
			if(e1.length() == e2.length()) {
				for(int i=0; i<e1.length(); i++) {
					if(e1.charAt(i) != e2.charAt(i)) return e1.charAt(i) - e2.charAt(i);
				}
				return e1.charAt(e1.length()-1) - e2.charAt(e1.length()-1);
			}
			else return e1.length() - e2.length();
		});
		
		for (String ss : str) sb.append(ss).append('\n');
        
		System.out.print(sb);
		br.close();
	}
}
