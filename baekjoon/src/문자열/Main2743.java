package 문자열;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2743 {
	// 백준 2743번: 단어 길이 재기
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(str.length());		
		
		br.close();
		
	}
}
