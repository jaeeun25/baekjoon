package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		boolean[] cnt = new boolean[2000000001];
		int num, min = Integer.MAX_VALUE, idx=0;
		
		for(int i=0; i<n; i++) {
			num = Integer.parseInt(st.nextToken());
			arr[i] =  num;
			cnt[num+1000000000] = true;
			min = min > num ? num+1000000000 : min;
		}



		for(int i=min; i<2000000001; i++) {
			if(cnt[i]) {
				
			}
		}
		System.out.println(sb);
	}
}

