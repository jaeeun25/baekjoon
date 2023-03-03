package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2563 {
	// 백준 2563번: 색종이
	// boolean 2차 배열을 이용해 색종이가 있는 부분은 for문을 이용해 true로 바꾼다.
	// 색종이가 붙은 부분을 탐색할 때 true를 만나면 겹치는 부분으로 cnt값을 하나 증가시켜 겹치는 면적을 구한다.
	// for문이 종료된후 전체 면적에서 겹치는 면적을 빼면 된다.
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int x = 0, y = 0, cnt = 0;
		boolean[][] paper = new boolean[100][100];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;
			
			for(int j = x; j < x+10; j++){
				for(int k = y; k<y+10; k++) {
					if(!paper[j][k]) paper[j][k] = true;
					else cnt++;
				}
			}	 
		}
		
		bw.write(String.valueOf((100*n)-cnt));
		
		br.close();
		bw.flush();
		bw.close();
	}
}
