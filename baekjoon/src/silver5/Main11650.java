package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main11650 {
	// 백준 11650번: 좌표정렬하기
	// Comparator를 람다식으로 표현해 풀 수있다.
	// Comparable/Comparator는 객체를 비교할 수 있게 해준다.
	// Comparable - 자기 자신과 매개변수 객체를 비교 -> compareTo메소드 구현해야함
	// Comparator - 두 매개변수 객체를 비교 -> compare메소드 구현해야함
	// 두 메소드는 정수 값을 반환
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// Comparator 기능만 따로 두고싶으면 익명 객체(클래스)를 활용
		Arrays.sort(arr, (e1, e2) -> {					// compare메소드 람다식
			if(e1[0] == e2[0]) return e1[1] - e2[1];	// 정수 값반환이므로 이런식으로 표현 가능(자료형 범위 주의해서 사용)
			else return e1[0] - e2[0];					// 값이 음수, 양수인지에 따라 교환을 결정하므로 두 원소 차로 음,양수만 판단해주면 된다.
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
		
		/* 시간초과
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[i][0] = x;
			arr[i][1] = y;
			
		}
		int min = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i][1] > arr[j][1]) {
					if(arr[i][0] < arr[j][0]) continue;
					else if(arr[i][0] > arr[j][0]) {
						min = arr[j][0];
						arr[j][0] = arr[i][0];
						arr[i][0] = min;
					}
					
					min = arr[j][1];
					arr[j][1] = arr[i][1];
					arr[i][1] = min;
				}
			}
		}
		
		for(int[] i : arr) {
			for(int j : i) sb.append(j + " ");
			sb.append('\n');
		}
		System.out.println(sb);
		*/
		br.close();
	}
}
