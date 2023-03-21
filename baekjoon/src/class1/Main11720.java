package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11720 {
	// 백준 11720번: 숫자의 합
	// charAt(), getBytes()를 이용할 수 있음
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] str = br.readLine().split("");
		
		int sum = 0;
		for(String s : str) {
			sum += Integer.parseInt(s);
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
