package 문자열;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10809 {
	// 백준 10809번: 알파벳 찾기
	// String 길이는 length();		--> 괄호 추가(배열 길이는 .length)
	
	public static void main(String[] args) throws IOException {
		
		int[] alpa = new int[26];
		Arrays.fill(alpa, -1);		// 일괄 초기화
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//String[] a = br.readLine().split("");
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			int num = s.charAt(i) - 'a';
			if(alpa[num] == -1) alpa[num] = i;
		}
		
		for(int i : alpa)
			System.out.print(i + " ");
		
		br.close();
	
	}
}
