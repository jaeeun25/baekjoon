package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main27866 {
	// 백준 27866번: 문자와 문자열
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		System.out.println(str.charAt(i-1));
		
		br.close();
	}
}
