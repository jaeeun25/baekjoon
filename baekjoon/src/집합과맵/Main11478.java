package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main11478 {
	// 백준 11478번: 서로 다른 부분 문자열의 개수
	// String 배열을 사용하지않고 그냥 String이 가진 메소드 중 substring()이용해서 할 수 있다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		HashSet<String> hs = new HashSet<> ();
		String s = "";
		
		for(int i=0; i<str.length; i++) {
			for(int j=i; j<str.length; j++) {
				s += str[j];
				hs.add(s);
			}
			s = "";
		}
		
		System.out.println(hs.size());
		
		br.close();
	}
}
