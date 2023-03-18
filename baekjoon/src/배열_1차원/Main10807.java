package 배열_1차원;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10807 {
	// 백준 10807번: 개수 세기
	// BufferedWriter로는 무조건 String만 읽을 수 있기 때문에 정수 출력시 변환 작업 필요
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int v = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<n; i++) 
			if(v == Integer.parseInt(st.nextToken())) cnt++;	
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
