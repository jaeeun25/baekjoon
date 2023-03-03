package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2869 {
	// 백준 2869번: 달팽이는 올라가고 싶다
	// 시간 제한 있기때문에 반복문으로 풀 수 없음
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int n = (v-b) / (a-b);
		
		if( (v-b) % (a-b) != 0) n +=1;

		bw.write(String.valueOf(n));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
