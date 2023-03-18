package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1427 {
	// 백준 1427번: 소트인사이드
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 카운팅 정렬
		String[] n = br.readLine().split("");
		int[] cnt = new int[10];
		
		for(String i : n) 
			cnt[Integer.parseInt(i)]++; 
		
		for(int i=9; i>=0; i--) {
			while(cnt[i] > 0) {
				sb.append(i);
				cnt[i]--;
			}
		}
		
		/* toCharArray + Array.sort
		char[] arr = br.readLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		
		*/
		
		/* charAt + 카운팅 정렬
		
		int[] cnt = new int[10];
		String num = br.readLine();
		
		for(int i=0; i<num.length(); i++) 
			cnt[num.charAt(i) - '0']++; 
		
		for(int i=9; i>=0; i--) {
			while(cnt[i]-- > 0) {
				sb.append(i);
			}
		}		
		*/
		
		System.out.println(sb);
		
		br.close();
	}
}
