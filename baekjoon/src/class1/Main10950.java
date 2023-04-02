package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10950 {
	// 백준 10951번: A+B - 3
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        int a, b, n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sb.append(a+b).append('\n');
        }
        System.out.print(sb);
        br.close();
	}
}
