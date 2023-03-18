package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main18870 {
	// 백준 18870번: 좌표 압축
	// 중복되는 값은 동일한 값을 갖으므로 중복을 허용하지 않는 HashMap, Set 자료구조 생각
	// 좌표 압축 개념은 세그먼트 트리 부분에서 은근 자주 쓰임
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;				// 순서 카운트 변수
		int[] arr = new int[n];		// 원본 배열
		int[] copyArr = new int[n];	// 카피한 배열 - 정렬
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			arr[i] = copyArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(copyArr);
		
		for(int num : copyArr) {
			if(!hm.containsKey(num)) {	// 해시맵에 num이 키로 없는 경우(한번도 추가되지 않은 경우)
				hm.put(num , cnt++);	// num, cnt를 추가하고 cnt 증가
			}
		}
		
		for(int key : arr) {
			sb.append(hm.get(key) + " ");
		}
		
		System.out.println(sb);
	}
}