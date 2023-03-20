package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10816 {
	// 백준 10816번: 숫자 카드2
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		int[] cnt = new int[20000001];
		int num = 0;
		for(int i=0; i<n; i++) {
			num = Integer.parseInt(st.nextToken()); 
			arr[i] = num;
			cnt[num + 10000000]++;
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		int num2 = 0;
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<m; i++) {
			num2 = Integer.parseInt(st.nextToken());
			if(binarySearch(arr, n, num2)) sb.append(cnt[num2 + 10000000] + " ");
			else sb.append("0 ");
			
		}
		
		System.out.println(sb);
		
		br.close();
	}
	
	public static boolean binarySearch(int[] arr, int n, int num) {
		
		int left = 0, right = n - 1;
		int mIdx = 0, mid = 0;
		
		while(left <= right) {
			mIdx = (left + right) / 2;
			mid = arr[mIdx];
			
			if(num == mid) return true;
			else if(num < mid) right = mIdx - 1;
			else if(num > mid) left = mIdx + 1;
		}
		return false;
	}
}
