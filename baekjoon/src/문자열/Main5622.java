package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5622 {
	// 백준 5622번: 다이얼
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int time = 0;
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
				case 'A': case 'B': case 'C': time+=3; break;
				case 'D': case 'E': case 'F': time+=4; break;
				case 'G': case 'H': case 'I': time+=5; break;
				case 'J': case 'K': case 'L': time+=6; break;
				case 'M': case 'N': case 'O': time+=7; break;
				case 'P': case 'Q': case 'R': case 'S': time+=8; break;
				case 'T': case 'U': case 'V': time+=9; break;
				case 'W': case 'X': case 'Y': case 'Z': time+=10; break;		
			}
		}
		
		System.out.print(time);
		br.close();
	}
}
