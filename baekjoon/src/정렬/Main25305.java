package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main25305 {
	// 백준 25305번: 커트라인
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] list = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순 정렬
		Arrays.sort(list);
		System.out.println(list[n-k]);
		
		/*
		// 내림차순 정렬
		Arrays.sort(list,Collections.reverseOrder());
        System.out.println(list[k-1]);
        */
		
		br.close();
	}
}
