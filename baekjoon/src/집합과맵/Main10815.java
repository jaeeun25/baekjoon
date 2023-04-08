package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10815 {
	// 백준 10815번: 숫자 카드
	// 이분탐색 문제
	// 먼저 배열을 정렬한 상태로 가지고 있어야한다.
	// 중간값과 비교해 작으면 왼쪽, 크면 오른쪽에 있다는 걸 알 수 있다.
	// 비교후 중간 값을 수정한다.
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);		// 배열 오름차순 정렬
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<m; i++) {
			if(binarySearch(arr, n, Integer.parseInt(st.nextToken()))) {
				sb.append("1 ");
			}
			else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
		
		br.close();
		
		/* 내 풀이법(이분탐색을 이용하지않음)
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		for(int i=0; i<n; i++) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			if(numbers.contains(Integer.parseInt(st.nextToken()))) {
				sb.append(1 + " ");
			}
			else {
				sb.append(0 + " ");
			}
		}
		
		System.out.println(sb);
		*/
	}
	
	// 이진탐색
	private static boolean binarySearch(int[] arr, int n, int num) {
		int left = 0;
		int right = n - 1;
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
