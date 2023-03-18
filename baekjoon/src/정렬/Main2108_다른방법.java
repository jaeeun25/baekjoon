package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main2108_다른방법 {
	// 백준 2108번: 통계학
	// 카운팅 정렬 사용
	// 원래 푼 방식보다 좀 더 메모리, 시간 효율적
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];
		
		int sum = 0;					// 총 합계
		int max = Integer.MIN_VALUE;	// 최댓값
		int min = Integer.MAX_VALUE;	// 최솟값
		int median = 10000;				// 중앙값
		int mode = 10000;				// 최빈값
		
		
		for(int i=0; i<n; i++) {
			int num =  Integer.parseInt(br.readLine());
			sum += num;
			arr[num+4000]++;
			
			if(max < num) max = num;
			if(min > num) min = num;
		}
		
		int count = 0;				// 중앙값 빈도 누적 수
		int mode_max = 0;			// 최빈값의 최댓값
		boolean flag = false;		// 이전에 동일한 최빈값이 1번만 등장했을 경우 true
		
		for(int i=min+4000; i<=max+4000; i++) {
			if(arr[i] > 0) {
				// 중앙값 찾기
				// 누적 횟수가 전체 길이의 절반에 못 미치는 경우
				if(count < (n+1) / 2) {
					count += arr[i];		// i값의 빈도수를 count에 누적
					median = i - 4000;
				}
				
				// 최빈값 찾기
				// 이전 최빈값보다 현재 값의 빈도 수가 더 높은 경우
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;		// 첫 등장이므로 true로 변경
				}
				// 이전 최빈값 최댓값과 동일한 경우 && 한 번만 중복인 경우
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
	
		// 산술평균
		sb.append((int)Math.round((double)sum/n)).append('\n');
		// 중앙값
		sb.append(median).append('\n');
		// 최빈값
		sb.append(mode).append('\n');
		// 범위
		sb.append(max-min);
		
		System.out.print(sb);
	}
}