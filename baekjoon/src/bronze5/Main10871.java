package bronze5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main10871 {
	// 백준 10871번: X보다 작은 수
	// System.out.println보다 BufferedWriter 이용이 더 효율적
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nx = br.readLine().split(" ");
		
		int n = Integer.parseInt(nx[0]);
		int x = Integer.parseInt(nx[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(x > num) {
				bw.write(num + " ");
			}	
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
