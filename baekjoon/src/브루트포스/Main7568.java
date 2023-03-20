package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 클래스 이용해 2차원배열이 아닌 1차원배열로 풀어봄
class Person{
	int kg;
	int cm;
	
	public Person(int kg, int cm) {
		this.kg = kg;
		this.cm = cm;
	}
}
*/

public class Main7568 {
	// 백준 7568번: 덩치
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		//Person[] arr1 = new Person[n];
		int rank = 1;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(),  " ");
			//arr1[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
				/*
				if(i == j) continue;
				if(arr1[i].cm < arr1[j].cm && arr1[i].kg < arr1[j].kg) {
					rank++;
				}
				*/
			}
			sb.append(rank + " ");
			rank = 1;
		}
		
		System.out.println(sb);
	}
}