package bronze5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10818 {
	// 백준 10818번: 최소, 최대

	public static void main(String[] args) throws IOException{
		/*
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] number = new int[n];
		
		for(int i=0; i<n; i++) 
			number[i] = sc.nextInt();
		
		sc.close();
		Arrays.sort(number);
		
		System.out.print(number[0] + " " + number[n-1]);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		
		System.out.print(min + " " + max);
		
		br.close();
		
	}
}