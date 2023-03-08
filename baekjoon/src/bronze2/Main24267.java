package bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24267 {
	// 백준 24267번: 알고리즘 수업 - 알고리즘의 수행 시간 6
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println((n*(n-2)*(n-1))/6);
		System.out.println(3);
		
		br.close();
	}
}

/*
 n=7
i=1 
j=2 -> k = 3,4,5,6,7 (n+2)
j=3 -> k = 4,5,6,7
j=4 -> k = 5,6,7
j=5 -> k = 6,7
j=6 -> k = 7
15

i=2
j=3 -> k = 4,5,6,7
j=4 -> k = 5,6,7
j=5 -> k = 6,7
j=6 -> k = 7
10

i=3
j=4 -> k = 5,6,7
j=5 -> k = 6,7
j=6 -> k = 7
6

i=4
j=5 -> k = 6,7
j=6 -> k = 7
3

i=5
j=6 -> k = 7
1
n(n-2)
*/