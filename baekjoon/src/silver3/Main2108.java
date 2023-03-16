package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2108 {
	// 백준 2108번: 통계학
	// 카운팅 정렬 + Arrays
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] cnt = new int[8001];	// 최빈값 찾기 위한 카운팅 정렬
		int num;
		
		for(int i=0; i<n; i++) {
			num = Integer.parseInt(br.readLine());
			arr[i] = num;
			cnt[num+4000]++;
		}

		// 산술평균
		String str = String.format("%.0f", (double)Arrays.stream(arr).sum()/n);
		if(str.charAt(0) == '-' && str.charAt(1) == '0') {		// -0인 경우 0만 출력
			str = "0";
		}
		sb.append(str).append('\n');
		
		// 중앙값
		Arrays.sort(arr);					// 정렬 후
		sb.append(arr[n/2]).append('\n');	// 중앙 값 찾기(n은 홀수이므로 /2면 중앙 값 찾기 가능)
		
		// 최빈값
		int max = Integer.MIN_VALUE;
		int idx = 0, count = 1;			// 최빈값, 최빈 값이 여러 개인 경우 두 번째로 작은 값을 출력하기 위한 변수
		for(int i=0; i<cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				idx = i;
				count=1;
			}
			else if(max == cnt[i] && count < 2) {		// count < 2 즉, 한번만 중복된 경우
				max = cnt[i];
				idx = i;
				count++;
			}
		}
		sb.append(idx-4000).append('\n');
		
		// 범위
		sb.append(arr[n-1]-arr[0]);
		
		System.out.print(sb);
	}
}