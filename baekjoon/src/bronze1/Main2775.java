package bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2775 {
	// 백준 2775번: 부녀회장이 될테야
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[][] apt = new int[15][15];
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<14; j++) {
				if(i==0) apt[i][j] = j+1;
				else if(j==0) apt[i][j] = 1;
				else apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
				
		for(int i=0; i<t; i++) { 
			int k = Integer.parseInt(br.readLine());
			int n =Integer.parseInt(br.readLine());
		  
			bw.write(String.valueOf(apt[k][n-1]) + "\n"); 
		}
 		
		br.close();
		bw.flush();
		bw.close();
	}
}